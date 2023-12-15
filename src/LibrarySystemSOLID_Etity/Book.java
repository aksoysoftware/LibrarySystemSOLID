package LibrarySystemSOLID_Etity;

public class Book extends Material {
	
	private String ısbnNo;
	private String bookCaseCode;
	
	
	public Book(String materialType, String materialName, String isbnNo, String bookCaseCode) {
		super(materialType, materialName);
		ısbnNo = isbnNo;
		this.bookCaseCode = bookCaseCode;
	}


	public String getIsbnNo() {
		return ısbnNo;
	}


	public void setIsbnNo(String isbnNo) {
		ısbnNo = isbnNo;
	}


	public String getBookCaseCode() {
		return bookCaseCode;
	}


	public void setBookCaseCode(String bookCaseCode) {
		this.bookCaseCode = bookCaseCode;
	}
	
	
	
	
	
	

	
	
}
