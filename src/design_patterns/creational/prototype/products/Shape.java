package design_patterns.creational.prototype.products;

public abstract class Shape {
    public double area;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.area = target.area;
            this.color = target.color;
        }
    }

    public abstract void countArea();

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape)) return false;
        Shape that = (Shape) obj;
        return this.color.equals(that.color) && this.area == that.area;
    }
}
