package exercises;

public class Minion {
	// Member variables
	private String name; 
	private int eyes; 
	private String color; 
	private String master;

	// Class Constructor
	public Minion(String name, int eyes, String color, String master) {
		super();
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	// Gets a Minion's name
	String getName() {
		return this.name;
	}
	// Gets a Minion's eyes
	int getEyes() {
		return this.eyes;
	}
	// Gets a Minion's color
	String getColor() {
		return this.color;
	}
	// Gets a Minion's Master
	String getMaster() {
		return this.master;
	}
	// Sets a Minion's name to a given parameter - String
	public void setName(String name) {
		this.name = name;
	}
	// Sets a Minion's eyes to a given parameter - Integer
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	// Sets a Minion's color to a given parameter - String
	public void setColor(String color) {
		this.color = color;
	}
	// Sets a Minion's master to a given parameter - String
	public void setMaster(String master) {
		this.master = master;
	}

}
