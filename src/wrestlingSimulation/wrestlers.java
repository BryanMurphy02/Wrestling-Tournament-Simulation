package wrestlingSimulation;

public class wrestlers {
	
	private String name;
	private double strength;
	private int id;
	private double weight;



	public wrestlers(String name, double strength, int id, double weight) {
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
	
	void setWeight(double weight) {
		this.weight = weight;
	}
}
