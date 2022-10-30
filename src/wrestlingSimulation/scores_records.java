package wrestlingSimulation;
//individual wrestlers records
//wins and losses
// head to head results in seeding

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class scores_records{

    

    //method for adding a new wrestler to the HashMap with a record of 0-0
    public void addWrestler(HashMap<wrestlers, Integer> map, wrestlers wrestler){
        Integer temp = 0;
        map.putIfAbsent(wrestler, temp);
    }

    //method to update a wrestler's record
    public void updateRecord(HashMap<wrestlers, Integer> map, wrestlers wrestler){
        map.replace(wrestler, map.get(wrestler)+1);
    }

    // //method to add a loss the to passed in wrestler's record
    // public void addLoss(HashMap<wrestlers, Integer> map, wrestlers wrestler){
        
    // }

    public void printMap(HashMap<wrestlers, Integer[]> records){
        // for(int i = 0; i < records.size(); i++){
            
        // }
        System.out.println(records);
    }

    public String getRecord(HashMap<wrestlers, Integer> wins, HashMap<wrestlers, Integer> losses, wrestlers wrestler){
        // Integer temp = map.get(wrestler);
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
        return wrestler.getName() + " record is: " + wins + " wins and " + losses + " losses\n";
    }
}