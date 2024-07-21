
public class ContinueTest {

	public static void main(String[] args) {
		
		int i = 0, sum = 0; 

		while (i < 4) {
			i++;
		 if (i % 3 == 0) continue;
		 sum += i;
		 
		}
		System.out.print(sum);
	}

}
