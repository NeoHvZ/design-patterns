package design_patterns.creational.singleton.example.multithreaded.safe;

public class Demo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            Singleton singleton1 = Singleton.getInstance("this is singleton1");
            System.out.println(Thread.currentThread().getName() + ": " + singleton1.value);
            System.out.println(Thread.currentThread().getName() + ": changing value");
            singleton1.value = "changed by singleton1";
        }, "thread1");

        Thread thread2 = new Thread(() -> {
            Singleton singleton2 = Singleton.getInstance("this is singleton1");
            System.out.println(Thread.currentThread().getName() + ": " + singleton2.value);
            System.out.println(Thread.currentThread().getName() + ": changing value");
            singleton2.value = "changed by singleton2";
        }, "thread2");

        System.out.println("if you see different values, then 2 singleton objects were created!");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=================================");
        System.out.println("if value was changed by the latter thread, then this singleton is thread-safe!");
        System.out.println(Singleton.getInstance().value);
    }
}
