package wku.ava.week10;

public class ThreeTypesOfLoops {

	public static void main(String[] args) {
		//for loop
		for(int i = 0; i < 2; i++) {
			System.out.println(i);
		}//while loop:adjust the variable
		int j = 0;
		while(j < 2) {
			System.out.println(j);
			j++;
		}//do-while loop:adjust the variable 
		int h = 0;
		do {
			System.out.println(h);
			h++;
		}while(h < 2);
	}

}
