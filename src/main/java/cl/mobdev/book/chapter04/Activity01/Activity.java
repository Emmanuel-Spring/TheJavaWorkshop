package cl.mobdev.book.chapter04.Activity01;

/**
 * Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: xx/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class Activity {
    public static void main(String[] args) {

        String [] texto ={"So","Many", "So","So","Books", "So", "Little", "Time", "So", "So", "So", "So"};
        String toSearch = "So";
        int occurrence = 1;

        for (int i = 0; i < 50; i++) {
            if (texto[i].compareToIgnoreCase(toSearch) == 0) {
                System.out.println("Found query at: " + i);
                occurrence++;
            }
        }
        if (occurrence > 1) {
            occurrence++;
            System.out.println("Found: " + occurrence + "coinciding words");
        }
    }
}


/*
OutPut
Found query at: 0
Found query at: 3
Found: 2coinciding words

 */