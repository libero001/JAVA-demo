import java.lang.Math;
class Circle extends Geometry {
    double radius;
    Circle (String name,String color, double radius)
    {
        super(name,color);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) return;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2*radius*Math.PI;
    }
}
