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
        init.initialize();

        //making the advancement ArrayLists
        ArrayList<teams> advancing = new ArrayList<>();

        
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
            advancing.add(match.runMatch(init.teamsDatabase.get(i), init.teamsDatabase.get(i+1)));
        }

        //run 8 matches for the eastern conference
        for(int i = 8; i < 16; i+=2){
            advancing.add(match.runMatch(init.teamsDatabase.get(i), init.teamsDatabase.get(i+1)));
        }

    }
}
