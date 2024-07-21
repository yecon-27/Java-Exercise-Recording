package wku.ava.inheritence;
//Ye Cong 1306248
public class BumbleBeeTest {

	public static void main(String[] args) {
		BumbleBee bee = new BumbleBee(4, 6, 1);
		bee.getWing();
		bee.getLeg();
		bee.getStinger();
		System.out.println(bee.toString());
		System.out.println(bee.stings());

	}

}
