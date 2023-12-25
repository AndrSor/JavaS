
package Lesson_02;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Prog {
    public static void main(String[] args) {

        //System.out.println("start");
        //System.out.println("");

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

//        Метод distinct - это промежуточная операция, которая фильтрует поток и позволяет передавать к следующей
//        операции только отдельные значения (по умолчанию с использованием метода Object::equals).
//        Java 8 Stream API
//        Create the list with duplicates.List<String> listAll = Arrays.asList("CO2", "CH4", "SO2", "CO2", "CH4", "SO2", "CO2", "CH4", "SO2");
//        Create a list with the distinct elements using stream.
//        List<String> listDistinct = listAll.stream().distinct().collect(Collectors.toList());
//        Display them to terminal using stream::collect with a build in Collector.
//      String collectAll = listAll.stream().collect(Collectors.joining(", "));
//      System.out.println(collectAll); //=> CO2, CH4, SO2, CO2, CH4 etc..
//      String collectDistinct = listDistinct.stream().collect(Collectors.joining(", "));
//      System.out.println(collectDistinct); //=> CO2, CH4, SO2

    }

}
