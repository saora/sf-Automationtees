package com;

import java.io.*;
import java.util.Properties;

public class FileDataReader implements InterfaceApplication {

    public Properties propertiesFile() {
        Properties propfile = new Properties();
        try {
            FileReader readFile = new FileReader(propertiesFile);
            propfile.load(readFile);

        } catch (IOException e) {
            System.out.println("File not found!! " + e);
        }

        return propfile;
    }


}

