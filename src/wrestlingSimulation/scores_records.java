package wrestlingSimulation;
//individual wrestlers records
//wins and losses
// head to head results in seeding




public class scores_records{

    public static void addID(int id, int[]record){
        init.records.put(id, record);
    }

    public static void addWin(int id){
        int[] temp = init.records.get(id);
        temp[0]+=1;
        init.records.replace(id, init.records.get(id), temp);
    }

    public static void addLoss(int id){
        int[] temp = init.records.get(id);
        temp[1]+=1;
        init.records.replace(id, init.records.get(id), temp);
    }

    public static void printMap(){
        System.out.print(init.records);
    }

    public static String getRecord(int id){
        wrestlers temp = null;
		for(int i = 0; i < init.wrestlerDatabase.size(); i++){
			if(init.wrestlerDatabase.get(i).getId() == id){
				temp = init.wrestlerDatabase.get(i);
			}
        }
        String name = temp.getName();
        int[] wrestlerRecord = init.records.get(id);
        return name + " has " + wrestlerRecord[0] + " wins and " + wrestlerRecord[1] + " losses.";
    }
}