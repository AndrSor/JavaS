package Lesson_01;

public abstract class Parent {

    private String Name;

    static {
        System.out.println("Parent:static 1");
    }

    {
        System.out.println("Parent:instance 1");
    }

    static {
        System.out.println("Parent:static 2");
    }

    public Parent(){
        System.out.println("Parent:constructor");
    }

    {
        System.out.println("Parent:instance 2");
    }

    public Parent(String name){
        setName(name);
        System.out.println("Parent:name-constructor");
    }

    public void setName(String name){
        this.Name = name;
    }

    public String getName(){
        return this.Name;
    }


}
