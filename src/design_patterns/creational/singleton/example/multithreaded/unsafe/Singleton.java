package design_patterns.creational.singleton.example.multithreaded.unsafe;

public class Singleton {
    private static Singleton cache;
    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(cache == null)
            cache = new Singleton(value);
        return cache;
    }
}
