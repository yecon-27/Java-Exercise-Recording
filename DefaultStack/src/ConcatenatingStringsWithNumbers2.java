
public class ConcatenatingStringsWithNumbers2 {

	public static void main(String[] args) {
		System.out.println(1 + "Welcome " + 1 + 1 );//1Welcome11

		System.out.println(1 + "Welcome " + (1 + 1));//1Welcome2

		System.out.println(1 + "Welcome " + ('\u0001' + 1));//1Welcome

		//Concatenating Characters:
		/*The character 'a' is a single-character string, 
		 * so it gets concatenated directly with the previous string without any conversion, resulting in "1Welcome a"
		 */
		System.out.println(1 + "Welcome " + 'a' + 1); //1Welcome98
	}

}
