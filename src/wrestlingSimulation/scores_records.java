package wrestlingSimulation;
//individual wrestlers records
//wins and losses
// head to head results in seeding

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class scores_records{

    HashMap<wrestlers, Integer[]> records = new HashMap<>();

    //method for adding a new wrestler to the HashMap with a record of 0-0
    public void addWrestler(wrestlers wrestler){
        Integer[] record = {0, 0};
        records.put(wrestler, record);
    }

    //method to add a win the to passed in wrestler's record
    public void addWin(wrestlers wrestler){
        if(records.containsKey(wrestler)){
            Integer[] temp = records.get(wrestler);
            temp[0]++;
            records.put(wrestler, temp);
        }
    }

    //method to add a loss the to passed in wrestler's record
    public void addLoss(wrestlers wrestler){
        if(records.containsKey(wrestler)){
            Integer[] temp = records.get(wrestler);
            temp[0]--;
            records.put(wrestler, temp);
        }
    }
}