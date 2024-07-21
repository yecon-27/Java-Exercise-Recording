package wku.ava.as1;
//Ye Cong 1306248
public class EscapeSequences {
	public static void main(String[] args) {
		//\b: backspace
		System.out.println("Good Morning\bPeppa!"); 
		//\t: tab
		System.out.println("Good Morning\tAva! "); 
		//\n: linefeed
		System.out.println("How was your Weekend! \nHow are you? \nDid you eat well? \nHave you studied? ");
		//\f: formfeed
		System.out.println("Good Morning Susie! \fHow are you? ");
		/*\r: carriage return(which is different from \n)
		CR will leave the text cursor stay at the beginning of the current line
		while LF will leave the cursor move to the next line but still stay at the end of the current line
		In Unix/Linux/MacOs : usually use LF to represent the start of the new line
		In Windows OS: usually use the combination CRLN to represent the start of the new line**/
		System.out.println("I am fine\rI tried Wenzhou food this weekend and it is amazing.");
		//\\: backslash
		System.out.println("Welcome to \\Wenzhou\\");
		//\":Double Quote Mark
		System.out.println("Welcome to \"WKU\".");

	}

}
