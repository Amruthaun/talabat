
package com.comcast.crm.genericfileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileUtility {
	public String getDataFromJsonFile(String key) throws FileNotFoundException, ParseException {
	FileReader fileR= new FileReader("./configAppData/appCommonData.json");
	JSONParser parser= new JSONParser();
	Object obj = parser.parse("fileR");
	JSONObject map = (JSONObject)obj;
	String data= (String)map.get(key);
	
	return data;
	
}

}
