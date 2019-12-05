package com;

import java.io.*;
import java.util.Properties;

public class FileDataReader implements InterfaceApplication{

    public Properties propertiesFile() {
        try {
            Properties propfile = new Properties();
            FileReader readFile = new FileReader(propertiesFile);
            propfile.load(readFile);

            return propfile;
        } catch (IOException e) {
           System.out.println("File not found!! "+e);
        }
       return propertiesFile();

    }

}

