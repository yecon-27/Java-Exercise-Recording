package wku.ava.inheritence;

public class AnimalPolymorphism2 {

	public static void main(String[] args) {
		Animal animal = new Animal("swimming");
		animal.move();
		Animal tilapiaFish = new Fish("swimming", 6);
		tilapiaFish.move();
		
		showMovement(new Fish("swimming", 6));
		
		Animal myAnimal = new Animal("flying");
		myAnimal.move();
		Animal robinBird = new Birds("flying", 2);
		robinBird.move();

		showMovement(new Birds("flying", 2));
		
		Animal myAnimal2 = new Animal("crawling");
		myAnimal2.move();
		Animal cobra = new Snake("crawling", "belly");
		cobra.move();
		
		showMovement(new Snake("crawling", "belly"));
	}
public static void showMovement(Animal x) {
	System.out.println(x.getModeOfMovement());
}
}
