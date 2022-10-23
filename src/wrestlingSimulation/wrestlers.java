package wrestlingSimulation;

public class wrestlers {
	
	private String name;
	private double strength;//out of 10.0
	private int id;
	private int weight;



	public wrestlers(String name, double strength, int id, int weight) {
		this.name = name;
		this.strength = strength;
		this.id = id;
		this.weight = weight;
	}
	
	String getName() {
		return this.name;
	}
	
	double getStrength() {
		return this.strength;
	}
	
	int getId() {
		return this.id;
	}
	
	double getWeight() {
		return this.weight;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setStrength(double strength) {
		this.strength = strength;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString(){
		return "Wrestler: " + this.name + "\nStrength: " + this.strength + "\nID: " + this.id + "\nWeight Class: " + this.weight + "\n\n";
	}
}
