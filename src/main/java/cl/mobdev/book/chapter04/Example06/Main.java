package cl.mobdev.book.chapter04.Example06;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: xx/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class Main {
    public static void main(String[] args) {
        String[] myArrays = new String[] {"2", "3", "25","79", "2", "456", "323", "25", "43", "424"};

        Set mySet = new HashSet();

        Collections.addAll(mySet, myArrays);
        System.out.println(mySet);

    }
}
