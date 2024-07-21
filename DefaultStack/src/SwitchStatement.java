
public class SwitchStatement {

	public static void main(String[] args) {
		int x = 3; 
		int y = 3;
		switch (x + 3) {
		 case 6: y = 1;
		 default: y += 1;
		}
		System.out.println(x);
		System.out.println(y);

	}

}
