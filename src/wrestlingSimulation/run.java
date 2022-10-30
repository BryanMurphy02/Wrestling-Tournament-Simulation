package wrestlingSimulation;

import java.util.ArrayList;

//main class
//run all the matches here
//add time intervals between each match

public class run {
    public static void main(String args[]){

        //making all the wrestlers
        init init = new init();
        bout bout = new bout();
        match match = new match();
        scores_records record = new scores_records();
        init.initialize();

        //making the advancement ArrayLists
        ArrayList<teams> secondRound = new ArrayList<>();
        ArrayList<teams> thirdRound = new ArrayList<>();
        ArrayList<teams> fourthRound = new ArrayList<>();


        
        // System.out.print(init.wrestlerDatabase);
        // System.out.print(init.teamsDatabase);

        // ArrayList<wrestlers> temp = new ArrayList<>();
        // temp.add(init.wrestlerDatabase.get(0));
        // temp.add(init.wrestlerDatabase.get(1));

        // System.out.println(temp.get(0) + "\n\n");
        // System.out.println(temp.get(1) + "\n\n");
        // System.out.println("Winner of the bout: \n" + bout.runBout(temp.get(0), temp.get(1)));

        // System.out.println("Before: \n\n\n\n" + init.teamsDatabase.get(0).getWrestlers());
        // teams temp = init.teamsDatabase.get(0);
        // ArrayList<wrestlers> temp2 = match.shuffleTeam(temp);
        // System.out.println("After: \n\n\n\n" + temp2);

        // System.out.println("Teams Database: " + init.teamsDatabase);


        //run 8 matches for western conference
        for(int i = 0; i < 8; i+=2){
            secondRound.add(match.runMatch(init.teamsDatabase.get(i), init.teamsDatabase.get(i+1)));
        }

        //run 8 matches for the eastern conference
        for(int i = 8; i < 16; i+=2){
            secondRound.add(match.runMatch(init.teamsDatabase.get(i), init.teamsDatabase.get(i+1)));
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


        // System.out.print("2nd Round teams: " + secondRound.size() + "\n\n\n");
        // System.out.print("3rd Round teams: " + thirdRound.size() + "\n\n\n");
        // System.out.print("4th Round teams: " + fourthRound.size() + "\n\n\n");
        // System.out.print("Winner: \n\n" + winner + "\n\n\n");
        

        // System.out.println("Size of stack1: " + init.stack1.size());
        // System.out.println("Size of stack6: " + init.stack6.size());

        // System.out.print(record.getRecord(init.records, winner.getWrestlers().get(1)));
        // System.out.println(init.records.size());

        // Integer[] temp69 = init.records.get(init.wrestlerDatabase.get(0));
        // System.out.println(temp69);


    }
}
