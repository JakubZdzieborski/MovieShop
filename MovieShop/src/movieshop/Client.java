package movieshop;

import java.util.Objects;

public class Client {

	private String firstName;
	private String lastName;
	private String birthDate;
	private char gender; 
	
	public Client(String firstName, String lastName, String birthDate, char gender ) {
		this.setFirstName(firstName); 
		this.setLastName(lastName);
		this.setBirthDate(birthDate);
		this.setGender(gender);

	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	 @Override
	    public String toString() {
	        return firstName + " " + lastName;
	    }

	@Override
	public int hashCode() {
		return Objects.hash(birthDate, firstName, gender, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(birthDate, other.birthDate) && Objects.equals(firstName, other.firstName)
				&& gender == other.gender && Objects.equals(lastName, other.lastName);
	}
	
	 
	 
}
