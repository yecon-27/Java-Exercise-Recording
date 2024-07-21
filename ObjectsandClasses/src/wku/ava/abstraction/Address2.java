package wku.ava.abstraction;
//Ye Cong 1306248
public class Address2 {
	private int houseNum;
	private String fullAddress;

	//两个构造方式
	//当你创建Address2的一个对象,但没有提供任何参数时,这个构造方法会被调用
	//Address2 addr = new Address2();
	public Address2() {}
	//当你需要创建一个Address2类的对象并希望初始化这两个成员变量时,这个构造方法会被调用
	//Address addr = new Address2(123, "123 Main Street")
	public Address2(int houseNum, String fullAddress) {
		this.houseNum = houseNum;
		this.fullAddress = fullAddress;
	}//1a.
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}//1b.
	public int getHouseNum() {
		return houseNum;
	}//2a.
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}//2b.
	public String getfullAddress() {
		return fullAddress;
	}
	public String displayAddress() {
		return houseNum + " " + fullAddress;
	}
}


