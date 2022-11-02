package wrestlingSimulation;
import java.util.ArrayList;


public class teams{


    private String teamName;
    private ArrayList<wrestlers> wrestlers;


    public teams(String teamName, ArrayList<wrestlers> wrestlers){
        this.teamName = teamName;
        this.wrestlers = wrestlers;
    }


    public void setSchool(String teamName){
        this.teamName = teamName;
    }

    public void setWrestlers(ArrayList<wrestlers> wresters){
        this.wrestlers = wresters;
    }


    public String getTeamName(){
        return this.teamName;
    }

    public ArrayList<wrestlers> getWrestlers(){
        return this.wrestlers;
    }

    public String toString(){
        return "Team name: " + teamName + "\nWrestlers on the Team: \n" + wrestlers +"\n";
    }

    




}
