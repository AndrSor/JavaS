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

        System.out.println(map);

        //int count1 = map.getCout(5); //2
        //System.out.println("map.getCout(5) = " + count1);
        //int count2 = map.getCout(6);  //1
        //System.out.println("map.getCout(6) = " + count2);
        //int count3 = map.getCout(10); // 3
        //System.out.println("map.getCout(10) = " + count3);
    }
}
