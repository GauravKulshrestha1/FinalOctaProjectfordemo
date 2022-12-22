package com.learn.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() {
		File src = new File("./Config/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not Able to load config file"+e.getMessage());
		}
	}
		public String getDataFromConfig(String ketTosearch) {
			return pro.getProperty(ketTosearch);
		}
		public String getBrowser() {
			return pro.getProperty("Browser");
		}
		
		public String getqaURL() {
			return pro.getProperty("qaURL");
		}
		
		
	}
