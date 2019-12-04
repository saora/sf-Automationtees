package utils;

import com.FileDataReader;

import javax.mail.*;
import javax.mail.search.FlagTerm;
import java.util.Properties;

@SuppressWarnings("All")
public class InboxReader {

    public static String getCode(String n) {
        String num = "";
        char[] ncode = {n.charAt(n.length() - 5), n.charAt(n.length() - 4), n.charAt(n.length() - 3), n.charAt(n.length() - 2), n.charAt(n.length() - 1)};
        for (int i = 0; i < ncode.length; i++) {
            num += ncode[i];
        }
        return num;
    }

    public static String getEmail() throws MessagingException {
        String vargetcode = "";
        FileDataReader prop = new FileDataReader();
        EncriptData getPass = new EncriptData();

        Properties props = System.getProperties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");
            store.connect("imap.gmail.com",prop.propertiesFile().getProperty("acct.u"),getPass.getEncrData());
            //store.connect("imap.gmail.com","glbltest.salesforce@gmail.com","61084n7mex01");
            Folder inbox = store.getFolder("Inbox");
            inbox.open(Folder.READ_WRITE);
            FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
            Message messages[] = inbox.search(ft);
            try {
                for (Message message : messages) {
                    if (message.getSubject().contains("Verify your identity in Salesforce")) {
                        message.setFlag(Flags.Flag.SEEN, true);
                        String cadena = message.getContent().toString();
                        char[] cadena_div = cadena.toCharArray();
                        String n = "";
                        for (int i = 0; i < cadena_div.length; i++) {
                            if (Character.isDigit(cadena_div[i])) {
                                n += cadena_div[i];
                            }
                        }
                        vargetcode = getCode(n);
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return vargetcode;
    }
}