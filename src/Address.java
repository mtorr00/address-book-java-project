
public class Address {

	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	
	
	public Address() {
		//no arg constructor
	}
	
	public Address(String firstName, String lastName, String phoneNum, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	@Override
	public String toString() {
		return "\n********************\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nPhone Number: " + phoneNum
				+ "\nEmail: " + email + "\n********************\n";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

