package LibrarySystemSOLID_DataBase;

import java.util.ArrayList;

import LibrarySystemSOLID_Etity.Material;

public class MSMaterial implements IDBMaterial{
	private ArrayList<Material> materials;
	
	public MSMaterial(ArrayList<Material> materials) {
		super();
		this.materials = materials;
	}
	

	public MSMaterial() {
		// TODO Auto-generated constructor stub
		 this.materials = materials != null ? materials : new ArrayList<>();
	}


	public ArrayList<Material> getMaterials() {
		return materials;
	}


	public void setMaterials(ArrayList<Material> materials) {
		this.materials = materials;
	}


	@Override
	public void addMaterial(Material material) {
		// TODO Auto-generated method stub
		materials.add(material);
		 System.out.println(material.getMaterialName() + " adli kitap tipindeki materyal bilgileri veritabanina kaydedilmistir");
		
	}

	@Override
	public void deleteMaterial(Material material) {
		// TODO Auto-generated method stub
		materials.remove(material);
		
		System.out.println(material.getMaterialName() + " adli kitap tipindeki materyal bilgileri veritabanindan silinmistir");

	}

	@Override
    public void searchMaterial(String name) {
		
		 System.out.println("Gulliver'in Gezileri adli materyal bilgileri veritabaninda araniyor");
        for (Material material : materials) {
            if (material.getMaterialName().equals(name)) {
               
                System.out.println("Bulunan kitap : " + material.getMaterialName());
            }
            
        }
		
		
		
	}

}
