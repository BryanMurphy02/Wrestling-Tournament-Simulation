package wrestlingSimulation;
//2 wrestlers and the results of the bout
//make there be a random chance one or both of the wrestlers get hurt
// if they have the same strength make it random who wins
// even if one person is stronger make there be a chance the other person can still win



public class bout{

    //call chance.getChance(int of either 25, 20, or 10)
    chance chance = new chance();
    

    //runs a bout between two wrestlers and returns the winner
    public wrestlers runBout(wrestlers wrestler1, wrestlers wrestler2){

        //there is a 25% chance that if a wrestler's strength is lower they can win
        if(wrestler1.getStrength() > wrestler2.getStrength()){
            if(chance.getChance(25) == true){
                int id = wrestler2.getId();
                scores_records.addWin(id);
                id = wrestler1.getId();
                scores_records.addLoss(id);
                return wrestler2;
            }
            else{
                int id = wrestler1.getId();
                scores_records.addWin(id);
                id = wrestler2.getId();
                scores_records.addLoss(id);
                return wrestler1;
            }
        }
        else if(wrestler2.getStrength() > wrestler1.getStrength()){
            if(chance.getChance(25) == true){
                int id = wrestler1.getId();
                scores_records.addWin(id);
                id = wrestler2.getId();
                scores_records.addLoss(id);
                return wrestler1;
            }
            else{
                int id = wrestler2.getId();
                scores_records.addWin(id);
                id = wrestler1.getId();
                scores_records.addLoss(id);
                return wrestler2;
            }
        }


        int id = wrestler1.getId();
        scores_records.addWin(id);
        id = wrestler2.getId();
        scores_records.addLoss(id);
        return wrestler1;
    }

    





}