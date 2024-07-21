
public class GenerateRandomValues {

	public static void main(String[] args) {
		int randomInt34To55 = (int)((Math.random() * (55 - 34 + 1)) + 34);
		int randomInt0To999 = (int)(Math.random() * 1000);
		double randomDouble5To55 = 5.5 + Math.random() * (55.5 - 5.5);
		System.out.println(randomInt34To55);
		System.out.println(randomInt0To999);
		System.out.println(randomDouble5To55);
	}

}
