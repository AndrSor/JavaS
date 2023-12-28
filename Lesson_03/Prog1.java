package Lesson_03;

public class Prog1 {

    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        // int count = map.getCout(5);  // 2
        // int count = map.getCout(6);  // 1
        // int count = map.getCout(10); // 3
    }
}
