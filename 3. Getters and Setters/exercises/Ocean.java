package exercises;

// 1. Create a class called Ocean
public class Ocean {

	public static void main(String args[]) {
		// 2. There make make a SeaCreature called “Spongebob”.
		SeaCreature spongebob = new SeaCreature("Spongebob");
		// 3. Use the methods below to make him eat, and laugh.
		spongebob.eat();
		spongebob.laugh();
		
		// 4. Make Patrick and Squidward and print their name, and make them laugh.
		SeaCreature patrick = new SeaCreature("Patrick");
		System.out.println(patrick.getName());
		patrick.laugh();
		
		SeaCreature squidward = new SeaCreature("Squidward");
		System.out.println(squidward.getName()); 
		squidward.laugh();
	}
}
