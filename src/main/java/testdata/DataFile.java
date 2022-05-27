 package testdata;

import utilities.Xls_Reader;

public class DataFile {
	
    Xls_Reader d = new Xls_Reader("C:\\Users\\Tejas\\Desktop\\Selenium\\testing\\gautamExcel.xlsx");
	
    //Login
	public String WromgEmail = d.getCellData("Data1", "Answer", 2);
	public String Password = d.getCellData("Data1", "Answer", 3);
	public String SpecialCharacter = d.getCellData("Data1", "Answer", 4);
	public String ErrForWrongEmail = d.getCellData("Data1", "Answer", 5);
	public String ErrForEmptyEmail = d.getCellData("Data1", "Answer", 6);
	public String ErrForEmptyPassword = d.getCellData("Data1", "Answer", 7);
	public String ErrForSpecialCharacter = d.getCellData("Data1", "Answer", 8);	

}
