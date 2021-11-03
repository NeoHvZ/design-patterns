package design_patterns.creational.singleton.example.single_threaded;

public class Singleton {
    private static Singleton cache;
    public String value;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(cache == null)
            cache = new Singleton();
        return cache;
    }

}
