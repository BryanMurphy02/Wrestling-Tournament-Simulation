package wrestlingSimulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

//main class
//run all the matches here
//add time intervals between each match

public class run{

    public static void wait(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        //making all the wrestlers
        // bout bout = new bout();
        init init = new init();
        match match = new match();
        // scores_records record = new scores_records();
        init.initialize();

        //making the advancement ArrayLists
        ArrayList<teams> secondRound = new ArrayList<>();
        ArrayList<teams> thirdRound = new ArrayList<>();
        ArrayList<teams> fourthRound = new ArrayList<>();

        


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
            input = scan.nextLine();
            if(input.equals("yes") || input.equals("Yes")){
                System.out.println("\n" + scores_records.getTeamRecord(winner.getTeamName()));
                for(int i = 0; i < winner.getWrestlers().size(); i++){
                    System.out.println(scores_records.getWrestlerRecord(winner.getWrestlers().get(i).getId()));
                }
            }
            else{
                System.out.println("\nThanks for coming to the tournament!");
            }
        }
        else if(keySlow.contains(input)){

        }
        else{
            System.out.println("This is an incorrent input. Please type \"fast\" or \"slow\"");
        }


        


        

        
    }
}
