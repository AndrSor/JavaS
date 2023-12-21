public class Child extends Parent {

    public Child(){

        System.out.println("Child:constructor");

    }

    public Child(String name){

        System.out.println("Child:name-constructor");

    }

    public static void stPrintChildren(int n){
        System.out.println("child:static " + n);
    }

    public void nonStPrintChildren(int n){
        System.out.println("child:instance " + n);
    }

}
