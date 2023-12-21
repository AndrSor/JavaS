public abstract class Parent {

    private String name;


    public Parent(){
        System.out.println("Parent:constructor");
    }

    public Parent(String name){
        setName(name);
        System.out.println("name: " + getName());
        System.out.println("Parent:name-constructor");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static void stPrintParent(int n){
        System.out.println("Parent:static " + n);
    }

    public void nonStPrintParent(int n){
        System.out.println("Parent:instance " + n);
    }


}
