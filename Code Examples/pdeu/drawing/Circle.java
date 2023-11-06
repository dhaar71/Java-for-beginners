public class Circle extends Shape {
    private double radius;

    public Circle(String color, String pattern, double radius) {
        super(color, pattern);
        this.radius = radius;
        countShapes++;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [Color: " + getColor() + ", Pattern: " + getPattern() + ", Radius: " + radius + "]";
    }
}
