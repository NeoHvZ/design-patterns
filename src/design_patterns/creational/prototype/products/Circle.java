package design_patterns.creational.prototype.products;

public class Circle extends Shape {

    public int r;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.r = target.r;
        }
    }

    @Override
    public void countArea() {
        this.area = r*r*Math.PI;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof Circle)) return false;
        Circle that = (Circle) obj;
        return this.r== that.r;
    }
}
