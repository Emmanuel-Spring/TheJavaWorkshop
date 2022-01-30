package cl.mobdev.book.chapter04.Example23;

import java.util.*;

public class Exercise02 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.put("OS", "Ubuntu Linux");
        properties.put("version", "18.04");
        properties.put("language", "English (UK)");

        String oldValue = (String) properties.setProperty("language", "German");

        if (oldValue != null) {
            System.out.println("modified the language property");
        }
        
        properties.list(System.out);
    }
}
