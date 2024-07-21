package wku.ava.inheritence;
//Ye Cong 1306248
public class FruitTest {

	public static void main(String[] args) {
		Fruit fruit = new GoldenDelicious();
		showInstance(fruit);

	}
public static void showInstance(Object object) {
	System.out.println("fruit is instance of Fruit: " + (object instanceof Fruit));
	System.out.println("fruit is instance of Apple: " + (object instanceof Apple));
	System.out.println("furit is instance of GoldenDelicious: " +(object instanceof GoldenDelicious));
	System.out.println("furit is instance of McIntosh: " + (object instanceof McIntosh));
}
}
