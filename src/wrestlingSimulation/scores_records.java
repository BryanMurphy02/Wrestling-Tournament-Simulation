package wrestlingSimulation;
//individual wrestlers records
//wins and losses
// head to head results in seeding




public class scores_records{

    //Method to add a wrestler to the HashMap with a blank record
    public static void addID(int id, int[]record){
        init.wrestlerRecords.put(id, record);
    }

    //uses passed in id to update the wrestler's record by adding a win
    public static void addWin(int id){
        int[] temp = init.wrestlerRecords.get(id);
        temp[0]+=1;
        init.wrestlerRecords.replace(id, init.wrestlerRecords.get(id), temp);
    }

    //uses passed in id to update the wrestler's record by adding a loss
    public static void addLoss(int id){
        int[] temp = init.wrestlerRecords.get(id);
        temp[1]+=1;
        init.wrestlerRecords.replace(id, init.wrestlerRecords.get(id), temp);
    }

    //uses passed in id to update the team's record by adding a win
    public static void addWin(String name){
        int[] temp = init.teamRecords.get(name);
        temp[0]+=1;
        init.teamRecords.replace(name, init.teamRecords.get(name), temp);
    }

    //uses passed in id to update the team's record by adding a loss
    public static void addLoss(String name){
        int[] temp = init.teamRecords.get(name);
        temp[1]+=1;
        init.teamRecords.replace(name, init.teamRecords.get(name), temp);
    }

    //prints the entire HashMaps of the wrestling records
    public static void printMap(){
        System.out.print(init.wrestlerRecords);
    }

    //Prints the record of a specific passed in wrestler
    public static String getWrestlerRecord(int id){
        wrestlers temp = null;
		for(int i = 0; i < init.wrestlerDatabase.size(); i++){
			if(init.wrestlerDatabase.get(i).getId() == id){
				temp = init.wrestlerDatabase.get(i);
			}
        }
        String name = temp.getName();
        int[] wrestlerRecord = init.wrestlerRecords.get(id);
        return name + " went " + wrestlerRecord[0] + "-" + wrestlerRecord[1];
    }

    //prints the record of a passed in team
    public static String getTeamRecord(String name){
        int[] temp = init.teamRecords.get(name);
        return "Team " + name + " went " + temp[0] + "-" + temp[1];
    }
}