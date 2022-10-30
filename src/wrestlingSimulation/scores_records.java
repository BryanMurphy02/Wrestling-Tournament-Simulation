package wrestlingSimulation;
//individual wrestlers records
//wins and losses
// head to head results in seeding

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class scores_records{

    

    //method for adding a new wrestler to the HashMap with a record of 0-0
    public void addWrestler(HashMap<wrestlers, Integer[]> records, wrestlers wrestler){
        Integer[] record = {0, 0};
        records.put(wrestler, record);
    }

    //method to add a win the to passed in wrestler's record
    public void addWin(HashMap<wrestlers, Integer[]> records, wrestlers wrestler){
        // if(records.containsKey(wrestler)){
            Integer[] temp = records.get(wrestler);
            temp[0] = temp[0] + 1;
            records.put(wrestler, temp);
        // }
    }

    //method to add a loss the to passed in wrestler's record
    public void addLoss(HashMap<wrestlers, Integer[]> records, wrestlers wrestler){
        // if(records.containsKey(wrestler)){
            Integer[] temp = records.get(wrestler);
            temp[1] = temp[1] + 1;
            records.put(wrestler, temp);
        // }
    }

    public String getRecord(HashMap<wrestlers, Integer[]> records, wrestlers wrestler){
        Integer[] temp = records.get(wrestler);
        // if(temp[0] == 0){
        //     return wrestler.getName() + " has no wins and " + temp[1] + " losses\n";
        // }
        // else if(temp[1] == 0){
        //     return wrestler.getName() + " has a flawless record with " + temp[0] + " wins\n";
        // }
        // else if(temp[0] == 1){
        //     if(temp[1] == 1){
        //         return wrestler.getName() + " record is: " + temp[0] + " win and " + temp[1] + " loss\n";
        //     }
        //     return wrestler.getName() + " record is: " + temp[0] + " win and " + temp[1] + " losses\n";
        // }
        // else if(temp[1] == 1){
        //     return wrestler.getName() + " record is: " + temp[0] + " wins and " + temp[1] + " loss\n";
        // }
        return wrestler.getName() + " record is: " + temp[0] + " wins and " + temp[1] + " losses\n";
    }
}