package Lesson_02;

public class Prog2 {

    public static void main(String[] args) {

        System.out.println("task 2");
        System.out.println("");

        PhoneBook pB = new PhoneBook();

        pB.add("+79523322554","Иванов");
        pB.add("+349523322554","Котиков");
        pB.add("+79882332255","Васечкин");
        pB.add("+79523322556","Иванов");
        pB.add("+79522222556","Несмеянова");

        System.out.println(pB.get("Иванов"));


    }
}
