package wku.ava.arrays;

public class PassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] grades = {7,9,3,4,1,5};
		for(int i :grades) {
			System.out.print(i + "\t");
		}
		System.out.println();
		PassByRe(grades);

		for(int i : grades)
			System.out.print(i + "\t");


	}
	public static void PassByRe(int[] g) {
		for(int i = 0; i < g.length; i++) {
			g[i] *= 2;
			System.out.print(g[i] + "\t");

		}//Ye Cong 1306248
		System.out.println();
	}

}
