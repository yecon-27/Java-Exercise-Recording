
public class ConcatenatingStringsWithNumbers {

	public static void main(String[] args) {
		System.out.println("1" + 1);//11
		System.out.println('1' + 1);//50(type casting: 1 in Unicode is 49)
		System.out.println("1" + 1 + 1);//111
		System.out.println("1" + (1 + 1));//12
		System.out.println('1' + 1 + 1);//51(type casting: 1 in Unicode is 51)

	}

}
