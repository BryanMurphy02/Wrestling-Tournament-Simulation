package wrestlingSimulation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
//12 wresters on the team
// Team record(wins and losses)
// Team Schedule

import javax.print.attribute.HashAttributeSet;

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
