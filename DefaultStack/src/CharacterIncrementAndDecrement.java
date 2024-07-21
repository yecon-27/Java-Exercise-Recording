
public class CharacterIncrementAndDecrement {

	public static void main(String[] args) {
		 char x = 'a';
		 char y = 'c';
		 System.out.println(++x);//'b',x = 'a'
		 System.out.println(y++);//'c',y = 'd'
		 System.out.println(x - y);//implicit casting the character into the integer type
	}

}
