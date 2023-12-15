package LibrarySystemSOLID_Etity;

public class Ebook extends Material{

	private String eBookAdress;

	public Ebook(String materialType, String materialName, String eBookAdress) {
		super(materialType, materialName);
		this.eBookAdress = eBookAdress;
	}

	public String geteBookAdress() {
		return eBookAdress;
	}

	public void seteBookAdress(String eBookAdress) {
		this.eBookAdress = eBookAdress;
	}
	
	
	
	
}
