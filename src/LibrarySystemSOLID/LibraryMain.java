package LibrarySystemSOLID;

import LibrarySystemSOLID_DataBase.IDBMaterial;
import LibrarySystemSOLID_DataBase.IDBUser;
import LibrarySystemSOLID_DataBase.MSMaterial;
import LibrarySystemSOLID_DataBase.MSSQLUser;
import LibrarySystemSOLID_Etity.Book;
import LibrarySystemSOLID_Etity.Ebook;
import LibrarySystemSOLID_Etity.Student;
import LibrarySystemSOLID_Etity.User;

public class LibraryMain {
	public static void main(String[] args) {
		Book book = new  Book("kitap","Seker Portakali","1221245" ,"TA-24" );
		Book book1 = new  Book("kitap","Seker Portakali","1221245" ,"TA-24" );
		
		
		
		IDBMaterial dbm = new MSMaterial();
	
	
		Ebook ebook = new Ebook("ekitap", "Suc ve Ceza ","www.ekitapadresi.com/sucveceza.pdf");
		dbm.addMaterial(ebook);
		dbm.addMaterial(book);
		dbm.deleteMaterial(book);
		dbm.addMaterial(book1);
		
		User user = new Student("ogrenciMehmet","Mehmet Turgut","ogrenci", "1923");
		
		IDBUser idbUser = new MSSQLUser();
		
		idbUser.addUser(user);
		idbUser.searchUser("Mehmet Turgut");
		idbUser.deleteUser(user);
		
		
	}

}
