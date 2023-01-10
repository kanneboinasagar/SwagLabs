package com.ecommerce.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDatafromPropFile
{
	public String readDataFromPropFile(String key) throws Exception
	{
	FileInputStream f=new FileInputStream(IAutoConstants.filepath);
	
	Properties p=new Properties();
	p.load(f);
	String value=p.getProperty(key);
	return value;
	
	
	}
	
	
	
	

}
