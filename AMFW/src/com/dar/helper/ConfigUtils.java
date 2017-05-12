package com.dar.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;

public class ConfigUtils {
	private Log logger = null;
	
	Properties prop;
	
   public  final String BROWSER;
   public  final String URL;
	
	
	public ConfigUtils(String fileName){
		//prop = new Properties(System.getProperty("user.dir")+"\\resources");
		
		try {
			prop.load(new FileInputStream(System.getProperty("user.dir")+"\\resources"+fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error("file not found plz give correct file details");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error("issue reading the given config properties file");
		}
		
		BROWSER = prop.getProperty("browser");
		
		URL = prop.getProperty("url");
		
	}
	
	

}
