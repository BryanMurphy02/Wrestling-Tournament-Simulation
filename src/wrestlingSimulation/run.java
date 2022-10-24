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
        init.initialize();

        
        // System.out.print(init.wrestlerDatabase);
        // System.out.print(init.teamsDatabase);

        // ArrayList<wrestlers> temp = new ArrayList<>();
        // temp.add(init.wrestlerDatabase.get(0));
        // temp.add(init.wrestlerDatabase.get(1));

        // System.out.println(temp.get(0) + "\n\n");
        // System.out.println(temp.get(1) + "\n\n");
        // System.out.println("Winner of the bout: \n" + bout.runBout(temp.get(0), temp.get(1)));
    }
}
