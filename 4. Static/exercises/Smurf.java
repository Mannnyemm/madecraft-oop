package exercises;

public class Smurf {

	// Member variables
	private String name;
	// Fixed/Static variables belonging to class
	private static int smurfetteCount;
	private static int papaCount;

	public static Smurf createSmurf(String name) {
		// Prevents displaying of "Creating Smurfette or Papa Smurf" more than once
		if((name.equalsIgnoreCase("smurfette") && smurfetteCount < 1) || (!name.equalsIgnoreCase("smurfette") && !name.equalsIgnoreCase("papa")) 
				|| (name.equalsIgnoreCase("papa") && papaCount < 1)) {
			
			System.out.println("Creating " + name + " Smurf");
		}
		if (name.equalsIgnoreCase("smurfette") && smurfetteCount < 1) {
			smurfetteCount++;
		}
		if ((name.equalsIgnoreCase("papa") && papaCount < 1)){
			papaCount++;
		}
		return new Smurf(name);
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}
	
	public static void main(String args[]) {
		Smurf smurfette = Smurf.createSmurf("Smurfette");
		Smurf smurfette1 = Smurf.createSmurf("Smurfette");
		Smurf papa = Smurf.createSmurf("Papa");
		Smurf papa1 = Smurf.createSmurf("Papa");
		Smurf smurfette2 = Smurf.createSmurf("Smurfette");
		Smurf handy = Smurf.createSmurf("handy");
		Smurf handy1 = Smurf.createSmurf("handy");
	}
}
