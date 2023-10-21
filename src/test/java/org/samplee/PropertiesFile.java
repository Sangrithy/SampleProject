package org.samplee;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static void readProperties() {
		try {
			FileReader read = new FileReader("C:\\Users\\Acer\\eclipse-workspace\\AaMaven\\src\\test\\resources\\TestData\\config.properties");
			Properties p = new Properties();
			p.load(read);
			String ufname = p.getProperty("userfname");
			System.out.println("First Name :" +ufname);
			String ulname = p.getProperty("userlname");
			System.out.println("Last Name :" +ulname);
			String upass = p.getProperty("password");
			System.out.println("Password :" +upass);
			String uplace = p.getProperty("place");
			System.out.println("Place :" +uplace);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		readProperties();
	}

}
