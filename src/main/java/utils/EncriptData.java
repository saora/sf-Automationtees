package utils;

import com.InterfaceApplication;
import org.jasypt.encryption.pbe.PBEStringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.EncryptableProperties;
import org.jasypt.properties.PropertyValueEncryptionUtils;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class EncriptData implements InterfaceApplication {
    public  void encryptProp(){
        String crypnombre, crypap, crypam;
        FileOutputStream os = null;
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("src/main/resources/properties/data.properties"));
            PBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
            encryptor.setPassword("an_$%&LOST");
            crypnombre = PropertyValueEncryptionUtils.encrypt("data1", encryptor);
            crypap = PropertyValueEncryptionUtils.encrypt("data2", encryptor);
            props.setProperty("email.username", crypnombre);
            props.setProperty("email.password", crypap);
            os = new FileOutputStream("src/main/resources/properties/data.properties");
            props.store(os, "Datos Encriptados.");
        } catch(IOException ioe){
            System.out.println("File cannot be created !!");
        }
    }

public String getEncrData(){
        String up="";
    try {
        PBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("an_$%&LOST");
        Properties settin = new EncryptableProperties(encryptor);
        settin.load(new FileInputStream(propertiesFile));
        up = settin.getProperty("acct.p");
    }catch (FileNotFoundException e) {
        System.out.println("File not found !!");
    } catch (IOException e) {
        System.out.println("The file could not be read due to an error");
    }
    return up;
}

}
