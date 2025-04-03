package com.comcast.ofd.User;

import java.io.FileInputStream;
import java.util.Properties;

public class dummy {
public static void main(String[] args, String Url) throws Throwable {
		
		FileInputStream fis= new FileInputStream("./confiAppData/FoodApp.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String data=pObj.getProperty(Url);
		
	}
}
