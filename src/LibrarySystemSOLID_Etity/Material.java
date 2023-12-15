package LibrarySystemSOLID_Etity;

public class Material {
	
	private String materialType;
	private String materialName;
	
	
	
	public Material(String materialType, String materialName) {
		super();
		this.materialType = materialType;
		this.materialName = materialName;
	}



	public String getMaterialType() {
		return materialType;
	}



	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}



	public String getMaterialName() {
		return materialName;
	}



	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	
	
	
	
	
	

}
