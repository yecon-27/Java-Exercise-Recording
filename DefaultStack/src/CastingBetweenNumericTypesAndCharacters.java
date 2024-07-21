
public class CastingBetweenNumericTypesAndCharacters {

	public static void main(String[] args) {
		/*Use print statements to find out the ASCII code for '1', 'A', 'B', 'a', and 'b'. 
		Use print statements to find out the character for the decimal codes 40, 59, 79, 85, 
		and 90. Use print statements to find out the character for the hexadecimal code 40, 
		5A, 71, 72, and 7A.*/
		
		//打印字符的ASCII码
		System.out.println("The ASCII code for '1' is: " + (int)'1');
		System.out.println("The ASCII code for 'A' is: " + (int)'A');
		System.out.println("The ASCII code for 'B' is: " + (int)'B');
		System.out.println("The ASCII code for 'a' is: " + (int)'a');
		System.out.println("The ASCII code for 'b' is: " + (int)'b');
		
		//打印十进制数字对应的字符
		System.out.println("The character for the decimal code 40 is: " + (char)40);
		System.out.println("The character for the decimal code 59 is: " + (char)59);
		System.out.println("The character for the decimal code 79 is: " + (char)79);
		System.out.println("The character for the decimal code 85 is: " + (char)85);
		System.out.println("The character for the decimal code 90 is: " + (char)90);
		
		//打印十六进制对应的字符
		System.out.println("The character for the hexadecimal code 0x40 is: " + (char)0x40);
		System.out.println("The character for the hexadecimal code 0x5A is: " + (char)0x5A);
		System.out.println("The character for the hexadecimal code 0x71 is: " + (char)0x71);
		System.out.println("The character for the hexadecimal code 0x72 is: " + (char)0x72);
		System.out.println("The character for the hexadecimal code 0x7A is: " + (char)0x7A);
	}

}
