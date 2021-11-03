package design_patterns.creational.singleton.example.multithreaded.safe;

public class Singleton {
    private volatile static Singleton cache;
    public String value;

    private Singleton(){}

    public static Singleton getInstance(){
        if(cache==null){
            cache = new Singleton();
        }
        return cache;
    }

    public static Singleton getInstance(String value){
        getInstance().value = value;
        return cache;
    }

}
