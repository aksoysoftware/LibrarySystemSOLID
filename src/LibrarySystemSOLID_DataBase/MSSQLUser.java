package LibrarySystemSOLID_DataBase;

import java.util.ArrayList;

import LibrarySystemSOLID_Etity.User;

public class MSSQLUser implements IDBUser{

	 private ArrayList<User> users;
	 
	
	
	public MSSQLUser(ArrayList<User> users) {
		super();
		this.users = users;
		
	}

	

	public MSSQLUser() {
		 this.users = users != null ? users : new ArrayList<>();
	}



	public ArrayList<User> getUsers() {
		return users;
	}



	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}


	@Override
	public void addUser(User user) {
		users.add(user);
		 System.out.println(user.getUserName() + " isimli kullanici veritabanina eklendi");
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		users.remove(user);
		 System.out.println(user.getUserName() + " isimli kullanici veritabanindan silindi");
	}

	@Override
	public void searchUser(String nameSurname) {
		System.out.println(nameSurname +" isimli kullanici veritabaninda araniyor ...");
		
		 for (User user : users) {
	            if (user.getNameSurname().contains(nameSurname)) {
	                // Match found, you can print or process the user here
	                System.out.println("bulunan kullanici : " + user.getNameSurname());
	            }
	        }
	}

	
	
}
