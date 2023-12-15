package LibrarySystemSOLID_Etity;

public class Student extends User {
  
	private  String schoolNumber;

	public Student(String userName, String nameSurname, String userType, String schoolNumber) {
		super(userName, nameSurname, userType);
		this.schoolNumber = schoolNumber;
	}

	public String getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	
	
	
	

}
