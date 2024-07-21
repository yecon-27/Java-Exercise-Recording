package wku.ava.inheritence;
//Ye Cong 1306248
public class GrassHopperTest {
	public static void main(String[] args) {
		GrassHopper grasshopper = new GrassHopper(2, 6);
		grasshopper.getLeg();
		grasshopper.getWing();
		System.out.println(grasshopper.toString());
		System.out.println(grasshopper.jump());
	}
}
