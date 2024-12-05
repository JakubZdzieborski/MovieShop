package movieshop;

public class Staff {

	
	private String firstName;
	private String lastName;
	private String birthDate;
	private String position;
	private char gender;
	public Staff(String firstName, String lastName, String birthDate, String position, char gender) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.position = position;
		this.gender = gender;
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
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "Staff [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", position="
				+ position + ", gender=" + gender + "]";
	}
	
	
}
