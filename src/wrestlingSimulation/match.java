package wrestlingSimulation;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class match{

    //class declarations
    bout bout = new bout();

    //queues that represent the lines for wrestling waiting to participate in a bout
    Queue<wrestlers> line1 = new LinkedList<>();
    Queue<wrestlers> line2 = new LinkedList<>();

    //ArrayLists for the winnders of the bouts
    ArrayList<wrestlers> winners = new ArrayList<>();

    //method to shuffle the wrestlers in a team
    public ArrayList<wrestlers> shuffleTeam(teams x){
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
    
    //forms the queues for people waiting for a bout
    public void makeLine(teams team1, teams team2){
        //making line 1
        ArrayList<wrestlers> temp1 = shuffleTeam(team1);
        for(int i = 0; i < temp1.size(); i++){
            line1.add(temp1.get(i));
        }

        //making line 2
        ArrayList<wrestlers> temp2 = shuffleTeam(team2);
        for(int i = 0; i < temp2.size(); i++){
            line2.add(temp2.get(i));
        }
    }

    //method to determine the winner of the match
    public teams determineWinner(teams team1, teams team2, ArrayList<wrestlers> winners){
        int numTeam1 = 0;
        int numTeam2 = 0;
        for(int i = 0; i < winners.size(); i++){
            if(team1.getWrestlers().contains(winners.get(i))){
                numTeam1++;
            }
            else{
                numTeam2++;
            }
        }
        
        if(numTeam1 > numTeam2){
            return team1;
        }
        return team2;
    }

    //method for all logic in a match
    // 12 bouts between 2 teams
    public teams runMatch(teams team1, teams team2){
        //calls the method to add to the queue(lines for people waiting)
        makeLine(team1, team2);
        for(int i = 0; i < 12; i++){
            wrestlers temp = bout.runBout(line1.peek(), line2.peek());
            winners.add(temp);
        }
        teams winningTeam = determineWinner(team1, team2, winners);
        
        return winningTeam;
    }

}
