package testCheck;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.comcast.crm.genericfileutility.ExcelUtility;
import com.comcast.ofd.BaseTest.BaseClass;
import com.comcast.ofd.generic.webdriverutility.JavaUtility;

public class Randomnumber extends BaseClass {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		JavaUtility jlib= new JavaUtility();
		ExcelUtility elib=new ExcelUtility();
		 String phoneNumber = jlib.generatePhoneNumber();
		 System.out.println(phoneNumber);
		 int ran = jlib.getRandomNumber();
		 
		 String username = elib.getDataFromExcel("sheet1", 1, 0);
		 System.out.println(username+ran);
		 String firstname= elib.getDataFromExcel("sheet1", 1, 1);
		 System.out.println(firstname);
		 
		 String lastname= elib.getDataFromExcel("sheet1", 1, 2);
		 System.out.println(lastname);
		 
		 System.out.println(username+ran+"@gmail.com");
		 
		 String Password=elib.getDataFromExcel("sheet1", 1, 4);
		 System.out.println(Password);
		 
		String Address = elib.getDataFromExcel("sheet1", 1, 5);
		 System.out.println(Address);
		 
		 
		 
		 
		 
	}

}
