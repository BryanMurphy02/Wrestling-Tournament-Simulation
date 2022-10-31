package wrestlingSimulation;
//2 wrestlers and the results of the bout
//make there be a random chance one or both of the wrestlers get hurt
// if they have the same strength make it random who wins
// even if one person is stronger make there be a chance the other person can still win

import java.util.Arrays;
import java.util.HashMap;


public class bout extends scores_records{

    init init = new init();

	HashMap<Integer, int[]> records = new HashMap<>();


    //records methods
    public void addID(int id, int[]record){
        records.put(id, record);
    }

    public void addWin(int id){
        int[] temp = records.get(id);
        System.out.println(Arrays.toString(temp));
    }

    public void addLoss(int id){

    }

    public void printMap(HashMap<wrestlers, Integer[]> records){

    }

    public String getRecord(int id){
        return "";
    }

    //call chance.getChance(int of either 25, 20, or 10)
    chance chance = new chance();
    // scores_records record = new scores_records();
    

    //runs a bout between two wrestlers and returns the winner
    public wrestlers runBout(wrestlers wrestler1, wrestlers wrestler2){

        //there is a 25% chance that if a wrestler's strength is lower they can win
        if(wrestler1.getStrength() > wrestler2.getStrength()){
            if(chance.getChance(25) == true){
                int id = wrestler2.getId();
                addWin(id);
                id = wrestler1.getId();
                addLoss(id);
                // record.updateRecord(init.records, wrestler2.getId(), 1);
                // record.updateRecord(init.records, wrestler1.getId(), -1);
                // System.out.println("Wrestler Record: " + Arrays.toString(init.records.get(wrestler2.getId())));
                return wrestler2;
            }
            else{
                // int id = wrestler1.getId();
                // addWin(id);
                // id = wrestler2.getId();
                // addLoss(id);
                // record.updateRecord(init.records, wrestler1.getId(), 1);
                // record.updateRecord(init.records, wrestler2.getId(), -1);
                // System.out.println("Wrestler Record: " + Arrays.toString(init.records.get(wrestler1.getId())));
                return wrestler1;
            }
        }
        else if(wrestler2.getStrength() > wrestler1.getStrength()){
            if(chance.getChance(25) == true){
                // int id = wrestler1.getId();
                // addWin(id);
                // id = wrestler2.getId();
                // addLoss(id);
                // record.updateRecord(init.records, wrestler1.getId(), 1);
                // record.updateRecord(init.records, wrestler2.getId(), -1);
                // System.out.println("Wrestler Record: " + Arrays.toString(init.records.get(wrestler1.getId())));
                return wrestler1;
            }
            else{
                // int id = wrestler2.getId();
                // addWin(id);
                // id = wrestler1.getId();
                // addLoss(id);
                // record.updateRecord(init.records, wrestler2.getId(), 1);
                // record.updateRecord(init.records, wrestler1.getId(), -1);
                // System.out.println("Wrestler Record: " + Arrays.toString(init.records.get(wrestler2.getId())));
                return wrestler2;
            }
        }


        // record.updateRecord(init.records, wrestler1.getId(), 1);
        // record.updateRecord(init.records, wrestler2.getId(), -1);
        // int id = wrestler1.getId();
        // addWin(id);
        // id = wrestler2.getId();
        // addLoss(id);
        return wrestler1;
    }

    





}