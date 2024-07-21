package Chapter5;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("	Multiplication Table");
		
		//Display the number title
		System.out.print("    ");
		for(int j = 1; j <= 9; j++)
			System.out.print("   " + j);
		System.out.println("\n ---------------------------------------");//A dash line
		
		//Display table body
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j <= 9; j ++) {
				//Display the product and align properly
				System.out.printf("%4d", i * j );
			}
			System.out.println();//To avoid the outer loop didn't execute
			}

	}

}
