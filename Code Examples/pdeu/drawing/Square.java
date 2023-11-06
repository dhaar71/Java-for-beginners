package pdeu.drawing;

public class Square extends Shape {
    private double side;

    public Square(String color, String pattern, double side) {
        super(color, pattern);
        this.side = side;
        countShapes++;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square [Color: " + getColor() + ", Pattern: " + getPattern() + ", Side: " + side + "]";
    }
}
