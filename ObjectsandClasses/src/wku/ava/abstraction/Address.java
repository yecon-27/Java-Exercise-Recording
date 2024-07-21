package wku.ava.abstraction;
//Ye Cong 1306248
public class Address {
	private String streetName;
	private String city;
	private String country;
	
	public Address() {
}//initialize the constructor
	public Address(String streetName, String city, String country) {
		this.streetName = streetName;
		this.city = city;
		this.country = country;
	}//1a.
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}//1b.
	public String getStreetName() {
		return streetName;
	}//2a.
	public void setCity(String city) {
		this.city = city;
	}//2b.
	public String getCity() {
		return city;
	}//3a.
	public void setCountry(String country) {
		this.country = country;
	}//3b.
	public String getCountry() {
		return country;
	}//4.
	public String displayAddress() {
		return streetName + " " + city + "  " + country;
	}
}//end class Address
