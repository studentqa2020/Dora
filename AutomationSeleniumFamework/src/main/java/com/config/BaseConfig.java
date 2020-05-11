package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseConfig {

	
public static String getconfig(String key) throws Throwable {  // key = URL
	
	Properties pro= new Properties ();// how to read config / not pad or text file?
	String path= "./config.propertes";
	FileInputStream fis = new FileInputStream(path);
	
	pro.load(fis);
	//System.out.println("pass");
	//return pro.get(path).toString();
	return pro.getProperty(key);  // getproperty returns value and it accept name
	
	
	}	
  public static void main(String[] args) throws Throwable {
	  System.out.println(BaseConfig.getconfig("URL"));
	  
	
}
}
