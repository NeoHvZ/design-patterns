package design_patterns.creational.prototype;


import design_patterns.creational.prototype.products.Shape;
import design_patterns.creational.prototype.registry.ShapeCache;

public class Demo {
    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();
        Shape shape1 = shapeCache.get("red circle");
        Shape shape2 = shapeCache.get("red circle");
        if(shape1 == shape2)
            System.out.println("they are one same object");
        else System.out.println("they are two different objects");
        if(shape1.equals(shape2))
            System.out.println("they are identical");
        else System.out.println("they are not identical");
    }
}
