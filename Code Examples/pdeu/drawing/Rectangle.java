public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, String pattern, double length, double width) {
        super(color, pattern);
        this.length = length;
        this.width = width;
        countShapes++;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle [Color: " + getColor() + ", Pattern: " + getPattern() + ", Length: " + length + ", Width: " + width + "]";
    }
}
