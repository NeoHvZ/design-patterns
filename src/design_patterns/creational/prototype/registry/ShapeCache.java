package design_patterns.creational.prototype.registry;

import design_patterns.creational.prototype.products.Circle;
import design_patterns.creational.prototype.products.Rectangle;
import design_patterns.creational.prototype.products.Shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public ShapeCache() {
        Circle circle = new Circle();
        circle.color = "red";
        circle.r = 2;
        circle.countArea();
        cache.put("red circle",circle);

        Rectangle rectangle = new Rectangle();
        rectangle.color="green";
        rectangle.length=10;
        rectangle.width=5;
        rectangle.countArea();
        cache.put("green rectangle",rectangle);

    }

    public Shape put(String key,Shape shape){
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key){
        return cache.get(key).clone();
    }
}
