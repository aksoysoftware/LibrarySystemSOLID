package LibrarySystemSOLID_DataBase;

import LibrarySystemSOLID_Etity.User;

public interface IDBUser {
	public void addUser(User user);
	public void deleteUser(User user);
	public void searchUser(String nameSurname);

}
