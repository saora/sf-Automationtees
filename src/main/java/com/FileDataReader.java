package com;

import java.io.*;
import java.util.Properties;

public class FileDataReader implements InterfaceApplication{

    public Properties propertiesFile()throws IOException{
        Properties propfile = new Properties();
        FileReader readFile = new FileReader(propertiesFile);
        propfile.load(readFile);
        return propfile;
    }


}

