public class A01 {

    public static void main(String[] args) {

        Child ch1 = new Child();
        Child ch2 = new Child("Артем");
        Child.stPrintChildren(1);
        Child.stPrintChildren(2);
        Child.stPrintParent(1);
        Child.stPrintParent(2);
        ch2.stPrintChildren(1);
        ch2.stPrintChildren(2);
        ch2.stPrintParent(1);
        ch2.stPrintParent(2);

    }


}
