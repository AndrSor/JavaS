package Lesson_05_Reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler{
    private Person person;
    public PersonInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy,Method method, Object[] args) throws Throwable{
        System.out.println("Привет!");
        //System.out.println("Вызван метод: " + method.getName());
        //System.out.println("Вызван метод: " + method.toString());
        //return null;
        return method.invoke(person, args);
    }
}
