package LibrarySystemSOLID_Etity;

public class Administrator extends User {

	private String registrationNumber;

	
	
	
	
	public Administrator(String userName, String nameSurname, String userType, String registrationNumber) {
		super(userName, nameSurname, userType);
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	
}
