package wrestlingSimulation;
import java.util.ArrayList;
import java.lang.Math;

public class weightClasses {
	//have to be at least 100 pounds
	
	
	//class between 100-110
	static ArrayList<wrestlers> ten = new ArrayList<>();
	

	
	//class between 110-120
	static ArrayList<wrestlers> twenty = new ArrayList<>();
	
	//class between 120-130
	static ArrayList<wrestlers> thirty = new ArrayList<>();
	
	//class between 130-140
	static ArrayList<wrestlers> forty = new ArrayList<>();
	
	//class between 140-150
	static ArrayList<wrestlers> fifty = new ArrayList<>();
	
	
	public static void main(String args[]){
		for(int i =0; i < 50; i++){
			double tempStrength = (double)(Math.random() * 100) + 1;
			double tempWeight = (double)(Math.random() * 100) + 1;
			wrestlers temp = new wrestlers("John Doe", tempStrength, i, tempWeight);
			ten.add(temp);
		}
		
		System.out.print(ten);
	}
	
}
