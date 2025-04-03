package com.comcast.crm.genericfileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
		public String getDataFromPropertiesFile(String Key) throws IOException {
		FileInputStream fis= new FileInputStream("./confiAppData/FoodApp.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String data=pObj.getProperty(Key);
		return data ;
	}

	
}
