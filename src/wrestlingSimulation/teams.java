package wrestlingSimulation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
//12 wresters on the team
// Team record(wins and losses)
// Team Schedule

import javax.print.attribute.HashAttributeSet;

public class teams{

    HashMap<String, ArrayList<wrestlers>> teamsDatabase = new HashMap<>();

    private String school;
    private ArrayList<wrestlers> wrestlers;


    public teams(String school, ArrayList<wrestlers> wrestlers){
        this.school = school;
        this.wrestlers = wrestlers;
    }


    public void setSchool(String school){
        this.school = school;
    }

    public void setWrestlers(ArrayList<wrestlers> wresters){
        this.wrestlers = wresters;
    }


    public String getSchool(){
        return this.school;
    }

    public ArrayList<wrestlers> getWrestlers(){
        return this.wrestlers;
    }

    public String toString(){
        return "School name: " + school + "\nWrestlers on the Team: \n" + wrestlers +"\n";
    }

    




}
