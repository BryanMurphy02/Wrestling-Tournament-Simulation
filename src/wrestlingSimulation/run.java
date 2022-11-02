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


    //method allows for the program to pause for the passed in amount of time
    public static void wait(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //method that will run the tournament instantly
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

        System.out.println("\nThe winner of the tournament is team " + winner.getTeamName());
        seeRecords(winner);
    }

    //method that will run the tournament with a waiting time in between every match
    public static void slowMethod(){
        System.out.println("How many seconds bewteen each match would you like?");
        int waitTime = (int)scan.nextDouble();
        if(waitTime == 1000){
            waitTime = 0;
        }
        else{
            if((waitTime >= 1) == false){
                System.out.println("This is an incorrent input. Please type a whole number larger than zero");
                waitTime = (int)scan.nextDouble();
                while((waitTime >= 1) == false){
                    System.out.println("This is an incorrent input. Please type a whole number larger than zero");
                    waitTime = (int)scan.nextDouble();
                }
            }
        }
        //run 8 matches for western conference
        System.out.println("Now commencing the 8 matches in the Western conference\n");
        wait(waitTime);
        for(int i = 0; i < 8; i+=2){
            String name1 = wrestlingSimulation.init.teamsDatabase.get(i).getTeamName();
            String name2 = wrestlingSimulation.init.teamsDatabase.get(i+1).getTeamName();
            System.out.println("Team " + name1 + " vs. Team " + name2);
            teams tempTeam = match.runMatch(wrestlingSimulation.init.teamsDatabase.get(i), wrestlingSimulation.init.teamsDatabase.get(i+1));
            secondRound.add(tempTeam);
            wait(waitTime);
            System.out.println("The winner is " + tempTeam.getTeamName() + "!\n");
        }

        //run 8 matches for the eastern conference
        System.out.println("Now commencing the 8 matches in the Eastern conference\n");
        wait(waitTime);
        for(int i = 8; i < 16; i+=2){
            String name1 = wrestlingSimulation.init.teamsDatabase.get(i).getTeamName();
            String name2 = wrestlingSimulation.init.teamsDatabase.get(i+1).getTeamName();
            System.out.println("Team " + name1 + " vs. Team " + name2);
            teams tempTeam = match.runMatch(wrestlingSimulation.init.teamsDatabase.get(i), wrestlingSimulation.init.teamsDatabase.get(i+1));
            secondRound.add(tempTeam);
            wait(waitTime);
            System.out.println("The winner is " + tempTeam.getTeamName() + "!\n");
        }

        //run 4 matches for the western conference 2nd round
        System.out.println("Now commencing the 4 matches in the second round of the Western Conference\n");
        wait(waitTime);
        ArrayList<teams> temp = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            temp.add(secondRound.get(i));
        }
        for(int i = 0; i < 2; i++){
            String name1 = wrestlingSimulation.init.teamsDatabase.get(i).getTeamName();
            String name2 = wrestlingSimulation.init.teamsDatabase.get(i+1).getTeamName();
            System.out.println("Team " + name1 + " vs. Team " + name2);
            teams tempTeam = match.runMatch(temp.get(i), temp.get(i+1));
            thirdRound.add(tempTeam);
            wait(waitTime);
            System.out.println("The winner is " + tempTeam.getTeamName() + "!\n");
        }

        temp.clear();

        //run 4 matches for the eastern conference 2nd round
        System.out.println("Now commencing the 4 matches in the second round of the Eastern Conference\n");
        wait(waitTime);
        for(int i = 4; i < 8; i++){
            temp.add(secondRound.get(i));
        }
        for(int i = 0; i < 2; i++){
            String name1 = wrestlingSimulation.init.teamsDatabase.get(i).getTeamName();
            String name2 = wrestlingSimulation.init.teamsDatabase.get(i+1).getTeamName();
            System.out.println("Team " + name1 + " vs. Team " + name2);
            teams tempTeam = match.runMatch(temp.get(i), temp.get(i+1));
            thirdRound.add(tempTeam);
            wait(waitTime);
            System.out.println("The winner is " + tempTeam.getTeamName() + "!\n");
        }

        temp.clear();

        //run 2 matches for the semi finals
        System.out.println("Now commencing the 2 matches in Semi-Finals\n");
        wait(waitTime);
        String name1 = thirdRound.get(0).getTeamName();
        String name2 = thirdRound.get(1).getTeamName();
        System.out.println("Team " + name1 + " vs. Team " + name2);
        teams tempTeam = match.runMatch(thirdRound.get(0), thirdRound.get(1));
        fourthRound.add(tempTeam);
        wait(waitTime);
        System.out.println("The winner is " + tempTeam.getTeamName() + "!\n");

        name1 = thirdRound.get(2).getTeamName();
        name2 = thirdRound.get(3).getTeamName();
        System.out.println("Team " + name1 + " vs. Team " + name2);
        tempTeam = match.runMatch(thirdRound.get(2), thirdRound.get(3));
        fourthRound.add(tempTeam);
        wait(waitTime);
        System.out.println("The winner is " + tempTeam.getTeamName() + "!\n");

        //run the final match
        System.out.println("Now commencing the Final match of the tournament. Whichever teams wins will be crowned victorious!\n");
        wait(waitTime);
        name1 = fourthRound.get(0).getTeamName();
        name2 = fourthRound.get(1).getTeamName();
        System.out.println("The final match is between: \n" + name1 + " and " + name2);
        teams winner = match.runMatch(fourthRound.get(0), fourthRound.get(1));
        wait(waitTime);
        System.out.println("The winner is: \n\n\n     " + winner.getTeamName() + "     \n\n");
        seeRecords(winner);
    }

    //This method checks the inputted string against the inputted array
    //Returns true if a match was found and false if not
    public static boolean checkInput(String input, String[] keys){
        for(int i = 0; i < keys.length; i++){
            if(keys[i].equals(input)){
                return true;
            }
        }
        return false;
    }

    //This method will ask the user if they want to see the records for the winning team
    //If the user picks yes, the record of the team and every wrestler on the team will be printed
    public static void seeRecords(teams winner){
        System.out.println("Would you like to see the records of the wrestlers?");
        String[] keysYes = {"yes", "Yes"};
        String[] keysNo = {"no", "No"};
        String[] allInputs = {"Yes", "yes", "No", "no"};
        String newUserInput = scan.nextLine();
        while(checkInput(newUserInput, allInputs) == false){
            newUserInput = scan.nextLine();
            if(checkInput(newUserInput, allInputs)){
                break;
            }
            else{
                System.out.println("This is not an accepable answer. Please type \"yes\" or \"no\"");
            }
        }
        


        if(checkInput(newUserInput, keysYes)){
            System.out.println("\n" + scores_records.getTeamRecord(winner.getTeamName()));
            for(int i = 0; i < winner.getWrestlers().size(); i++){
                System.out.println(scores_records.getWrestlerRecord(winner.getWrestlers().get(i).getId()));
            }
            playAgain();
        }
        else if(checkInput(newUserInput, keysNo)){
            System.out.println("\nThanks for coming to the tournament!");
            playAgain();
        }
    }

    //This method will ask the user if they want to run the simulation again
    public static void playAgain(){
        System.out.println("Would you like the simulation to run again?");
        String[] keys = {"Yes", "yes", "No", "no"};
        String[] yesKey ={"Yes", "yes"};
        String input = scan.nextLine();
        while(!checkInput(input, keys)){
            System.out.println("This is an incorrent input. Please type \"yes\" or \"no\"");
            input = scan.nextLine();
        }
        if(checkInput(input, yesKey)){
            runMain();
        }
        else{
            System.out.println("\nThanks for coming to the tournament!");
        }
    }

    //This is the main method which will run the entire simulation
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

    //main method
    public static void main(String args[]){

        runMain();
        
    }
}
