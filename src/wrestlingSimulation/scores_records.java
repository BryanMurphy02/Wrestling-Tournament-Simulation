package wrestlingSimulation;
//individual wrestlers records
//wins and losses
// head to head results in seeding


import java.util.HashMap;


abstract class scores_records{

    public abstract void addID(int id, int[]record);

    public abstract void addWin(int id);

    public abstract void addLoss(int id);

    public abstract void printMap(HashMap<wrestlers, Integer[]> records);

    public abstract String getRecord(int id);
}