
package Lesson_02;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Prog {
    public static void main(String[] args) {

        ArrayList<String> lstWithDuplicate = new ArrayList<>();
        for(int i = 0; i < 20; i ++) {
            lstWithDuplicate.add("Ростов");
            lstWithDuplicate.add("Москва");
            lstWithDuplicate.add("Адлер");
            lstWithDuplicate.add("Самара");
            lstWithDuplicate.add("Майкоп");
        }

        System.out.println("lstWithDuplicate:");
        System.out.println(lstWithDuplicate);

        System.out.println("");

        Set<String> setWithoutDuplicate  = new HashSet<String>(lstWithDuplicate);
        System.out.println("setWithoutDuplicate:");
        System.out.println(setWithoutDuplicate);


    }

}
