package wrestlingSimulation;

import java.util.ArrayList;

//main class
//run all the matches here
//add time intervals between each match

public class run{
    public static void main(String args[]){

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


        

        
    }
}
