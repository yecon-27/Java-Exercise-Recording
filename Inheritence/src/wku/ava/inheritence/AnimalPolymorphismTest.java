package wku.ava.inheritence;

public class AnimalPolymorphismTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.move();
		
		Animal tilapia = new Fish();
		//the setFins() is in the Fish class
		/*tilapia.setFins(6);
		tilapia.getFins();*/
		//Fish tilapia = new Animal() is wrong
		tilapia.move();
	
		
		Fish shark = new Fish();
		shark.setFins(7);
		shark.getFins();
		shark.move();
		
		Birds robin = new Birds();
		robin.setWings(2);
		robin.getWings();
		robin.move();
		
		Dog pomeranian = new Dog();
		pomeranian.setLegs(4);
		pomeranian.getLegs();
		pomeranian.move();
		
		Snake cobra = new Snake();
		cobra.setBelly("Belly");
		cobra.getBelly();
		cobra.move();
	}

}
