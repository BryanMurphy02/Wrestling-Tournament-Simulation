package wrestlingSimulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

//main class
//run all the matches here
//add time intervals between each match

public class run{

    static Scanner scan = new Scanner(System.in);
    static init init = new init();
    static match match = new match();

    //making the advancement ArrayLists
    static ArrayList<teams> secondRound = new ArrayList<>();
    static ArrayList<teams> thirdRound = new ArrayList<>();
    static ArrayList<teams> fourthRound = new ArrayList<>();

    public static void wait(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void fastMethod(){
        //run 8 matches for western conference
        for(int i = 0; i < 8; i+=2){
            secondRound.add(match.runMatch(wrestlingSimulation.init.teamsDatabase.get(i), wrestlingSimulation.init.teamsDatabase.get(i+1)));
        }

        //run 8 matches for the eastern conference
        for(int i = 8; i < 16; i+=2){
            secondRound.add(match.runMatch(wrestlingSimulation.init.teamsDatabase.get(i), wrestlingSimulation.init.teamsDatabase.get(i+1)));
        }

        //run 4 matches for the western conference 2nd round
        ArrayList<teams> temp = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            temp.add(secondRound.get(i));
        }
        for(int i = 0; i < 2; i++){
            thirdRound.add(match.runMatch(temp.get(i), temp.get(i+1)));
        }

        temp.clear();

        //run 4 matches for the eastern conference 2nd round
        for(int i = 4; i < 8; i++){
            temp.add(secondRound.get(i));
        }
        for(int i = 0; i < 2; i++){
            thirdRound.add(match.runMatch(temp.get(i), temp.get(i+1)));
        }

        temp.clear();

        //run 2 matches for the semi finals
        fourthRound.add(match.runMatch(thirdRound.get(0), thirdRound.get(1)));
        fourthRound.add(match.runMatch(thirdRound.get(2), thirdRound.get(3)));

        //run the final match
        teams winner = match.runMatch(fourthRound.get(0), fourthRound.get(1));

        System.out.println("\nThe winner of the tournament is team " + winner.getTeamName() + "!\nWould you like to print the records of the wrestlers on team " + winner.getTeamName() + "?(yes or no)");
        String input = scan.nextLine();
        String[] keysYes = {"yes", "Yes"};
        String[] keysNo = {"no", "No"};
        String[] yesNo = {"Yes", "yes", "no", "No"};
        if(!checkInput(input, yesNo)){
            System.out.println("This is an incorrent input. Please type \"fast\" or \"slow\"");
            String userInput = scan.nextLine();
            while(checkInput(userInput, yesNo) == false){
                System.out.println("This is an incorrent input. Please type \"fast\" or \"slow\"");
                userInput = scan.nextLine();
            }
            input = userInput;
        }


        if(checkInput(input, keysYes)){
            System.out.println("\n" + scores_records.getTeamRecord(winner.getTeamName()));
            for(int i = 0; i < winner.getWrestlers().size(); i++){
                System.out.println(scores_records.getWrestlerRecord(winner.getWrestlers().get(i).getId()));
            }
        }
        else if(checkInput(input, keysNo)){
            System.out.println("\nThanks for coming to the tournament!");
        }
    }

    public static void slowMethod(){

    }

    public static boolean checkInput(String input, String[] keys){
        for(int i = 0; i < keys.length; i++){
            if(keys[i].equals(input)){
                return true;
            }
        }
        return false;
    }

    public static void runMain(){
        //initializing all the objects
        init.initialize();

        //main logic starts here
        System.out.println("\nHello and welcome to the wrestling tournament.\n192 wrestlers are currently in line waiting to be assigned a team.");
        System.out.println("Forming teams...\n");
        wait(1);
        System.out.println("Forming teams...\n");
        wait(1);
        for(int i = 0; i < wrestlingSimulation.init.teamsDatabase.size(); i++){
            System.out.println("Team " + (i+1) + ": " + wrestlingSimulation.init.teamsDatabase.get(i).getTeamName());
        }
        System.out.println("\nNow that all the teams are formed, it is time for the tournament to commence.\nThe fast method will run the entire tournament immedietely while the slow method will go match by match\nWould you like to pick the fast method or the slow method?");


        ArrayList<String> keyFast = new ArrayList<>(Arrays.asList("fast", "Fast", "FAST"));
        ArrayList<String> keySlow = new ArrayList<>(Arrays.asList("slow", "Slow", "SLOW"));
        String input = scan.nextLine();
        
        if(keyFast.contains(input)){
            fastMethod();
        }
        else if(keySlow.contains(input)){
            slowMethod();
        }
        else{
            System.out.println("This is an incorrent input. Please type \"fast\" or \"slow\"");
            String temp = scan.nextLine();
            String[] keys = {"slow", "Slow", "SLOW", "fast", "Fast", "FAST"};
            while(!checkInput(temp, keys)){
                System.out.println("This is an incorrent input. Please type \"fast\" or \"slow\"");
                temp = scan.nextLine();
            }

            if(keyFast.contains(temp)){
                fastMethod();
            }
            else{
                slowMethod();
            }
        }
    }
    public static void main(String args[]){

        runMain();
        
    }
}
