
public class PrefixIncrement {

	public static void main(String[] args) {
			    int j = 0;
			    int i = ++j + j * 5;

			    System.out.println("What is i? " + i);//6
			    
			    int x = 0;
			    int y = ++x ;

			    System.out.println("What is x? " + x);//1
			    System.out.println("What is y? " + y);//1
			    
			    int c = 1;
			    int d = c++ + c;
			    System.out.println("d is " + d);//3
	}

}
