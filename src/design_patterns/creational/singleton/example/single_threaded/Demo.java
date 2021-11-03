package design_patterns.creational.singleton.example.single_threaded;

// single thread demo
public class Demo {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.value = "this is singleton1";
        singleton2.value = "this is singleton2";
        System.out.println("if you see different values, then 2 singleton objects were created!");
        System.out.println("singleton1: " + singleton1.value);
        System.out.println("singleton2: " + singleton2.value);
    }
}
