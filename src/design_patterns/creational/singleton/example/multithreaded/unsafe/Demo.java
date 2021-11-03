package design_patterns.creational.singleton.example.multithreaded.unsafe;

public class Demo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            Singleton singleton1 = Singleton.getInstance("this is singleton1");
            System.out.println(Thread.currentThread().getName() + ": " + singleton1.value);
        }, "thread1");

        Thread thread2 = new Thread(() -> {
            Singleton singleton2 = Singleton.getInstance("this is singleton2");
            System.out.println(Thread.currentThread().getName() + ": " + singleton2.value);
        }, "thread2");

        System.out.println("if you see different values, then 2 singleton objects were created!");
        thread1.start();
        thread2.start();

    }

}
