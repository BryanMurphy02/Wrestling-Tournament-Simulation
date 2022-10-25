package wrestlingSimulation;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class match{

    Queue<wrestlers> line = new LinkedList<>();

    public static ArrayList<wrestlers> shuffleTeam(teams x){
        ArrayList<wrestlers> tempTeam = x.getWrestlers();
        Random r = new Random();
        int n = tempTeam.size();
        for(int i = n-1; i > 0; i--){
            int j = r.nextInt(i);
            wrestlers temp = tempTeam.get(i);
            tempTeam.set(i, tempTeam.get(j));
            tempTeam.set(j, temp);
        }
        return tempTeam;
    }
    

    public void makeLine(teams team1, teams team2){
        // int temp = team1.getWrestlers().size();
        // for(int i = 0; i < temp; i++){
        //     ArrayList<wrestlers> team1Wrestlers = team1.getWrestlers();
        //     line.add(team1Wrestlers.get(i));
        // }

        // int temp2 = team2.getWrestlers().size();
        // for(int i = 0; i < temp2; i++){
        //     ArrayList<wrestlers> team2Wrestlers = team2.getWrestlers();
        //     line.add(team2Wrestlers.get(i));
        // }
        
    }

    public teams runMatch(teams team1, teams team2){
        //method for all logic in a math
        // 12 bouts between 2 teams
        // have a queue implemented using a linked list to see who is wrestling next
        return team1;
    }

}
