package LibrarySystemSOLID_Etity;

public  class User {
	private String userName;
	private String nameSurname;
	private String userType;
	
	
	
	
	
	public User(String userName, String nameSurname, String userType) {
		super();
		this.userName = userName;
		this.nameSurname = nameSurname;
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNameSurname() {
		return nameSurname;
	}
	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
}
