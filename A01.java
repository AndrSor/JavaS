public class A01 {
    // Home Work Lesson1
    public static void main(String[] args) {

        System.out.println("Home Work Lesson1");

        Child ch1 = new Child();
        Child ch2 = new Child("Артем");
        Child.stPrintParent(1);
        Child.stPrintParent(2);
        Child.stPrintChildren(1);
        Child.stPrintChildren(2);
        ch2.nonStPrintParent(1);
        ch2.nonStPrintParent(2);
        ch2.nonStPrintChildren(1);
        ch2.nonStPrintChildren(2);

    }


}
