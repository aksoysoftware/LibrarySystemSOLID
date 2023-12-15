package LibrarySystemSOLID_DataBase;

import LibrarySystemSOLID_Etity.Material;

public interface IDBMaterial {
	
	public void addMaterial(Material material);
	public void deleteMaterial(Material material);
	public void searchMaterial(String name);

}
