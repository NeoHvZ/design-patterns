package design_patterns.creational.prototype.products;

public class Rectangle extends Shape {
    public int width;
    public int length;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.length = target.length;
            this.width = target.width;
        }
    }

    @Override
    public void countArea() {
        this.area = width * length;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(super.equals(obj)) || !(obj instanceof Rectangle)) return false;
        Rectangle that = (Rectangle) obj;
        return this.width == that.width && this.length == that.length;
    }
}
