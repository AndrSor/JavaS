package Lesson_05_Reflection;

import java.lang.reflect.Proxy;
public class Main {
    public static void main(String[] args) {

        Man vasia = new Man("Вася",30, "Ростов","Россия");

        ClassLoader vasiaClassloader = vasia.getClass().getClassLoader();

        Class[] interfaces = vasia.getClass().getInterfaces();

        Person proxyVasia = (Person) Proxy.newProxyInstance(vasiaClassloader,interfaces,new PersonInvocationHandler(vasia));

        proxyVasia.introduce(vasia.getName());
        proxyVasia.sayAge(vasia.getAge());

    }
}
