package com.arcgate.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class PropertyReader {

	static Properties prop = new Properties();

    static {
        try {
            FileReader reader = new FileReader(System.getProperty("user.dir")+ "\\properties\\locator.properties");
            prop.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(PropertyReader.get("search"));  
    }
}


