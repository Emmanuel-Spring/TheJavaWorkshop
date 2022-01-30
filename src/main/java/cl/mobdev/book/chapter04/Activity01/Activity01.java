package cl.mobdev.book.chapter04.Activity01;

import java.util.Arrays;

public class Activity01 {
    public static void main(String[] args) {

        String [] text ={"So","Many", "So","So","Books", "So", "Little", "Time", "So", "So", "So", "So"};
        String toSearch = "so";
        int occurrence = -1;

        for(int i = 0; i < 5; i++) {
            if (text[i].compareToIgnoreCase(toSearch) == 0) {
                System.out.println("Found query at :" + i);
                occurrence++;
            } 
        }

        if (occurrence > -1) {
            occurrence++;
            System.out.println("Found: " + occurrence + " coinciding words");
        }
    }
}
