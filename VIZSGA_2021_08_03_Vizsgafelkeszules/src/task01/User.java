package task01;

public class User {

	private String firstName;
	private String lastName;
	private String userName;
	
	public User(String lastName,String firstName, String userName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.userName = userName;
	}
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String toString() {
		return "Név: "+this.lastName + " "+this.firstName + ", felhasználónév: "+this.userName; 
	}
}
