package pdeu.drawing;

public abstract class Shape {
    private String color;
    private String pattern;

    public Shape(String color, String pattern) {
        this.color = color;
        this.pattern = pattern;
    }
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public static int countShapes = 0;

    public static int countShapes() {
        return countShapes;
    }

    public String getColor() {
        return color;
    }

    public String getPattern() {
        return pattern;
    }
}
