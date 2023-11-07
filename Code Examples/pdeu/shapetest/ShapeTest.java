public class ShapeTest {
    public static void highestArea(Shape[] shapes) {
        if (shapes.length == 0) {
            System.out.println("No shapes provided.");
            return;
        }

        Shape maxAreaShape = shapes[0];
        double maxArea = shapes[0].calculateArea();

        for (Shape shape : shapes) {
            if (shape.calculateArea() > maxArea) {
                maxArea = shape.calculateArea();
                maxAreaShape = shape;
            }
        }

        System.out.println("Shape with the highest area: " + maxAreaShape);
    }

    public static void resizableShapes(Shape[] shapes) {
        System.out.println("Shapes that allow resizing:");
        for (Shape shape : shapes) {
            if (shape instanceof pdeu.drawing.Resizable) {
                System.out.println(shape);
            }
        }
    }

    public static double totalDecorativeMaterialForCircle(Shape[] shapes) {
        double totalDecorativeMaterial = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                totalDecorativeMaterial += shape.calculateArea();
            }
        }
        return totalDecorativeMaterial;
    }

    public static void main(String[] args) {
        Square square = new Square("Red", "Striped", 5);
        Circle circle = new Circle("Blue", "Dotted", 3);
        Triangle triangle = new Triangle("Green", "Solid", 4, 5, 6);

        Shape[] shapes = {square, circle, triangle};

        highestArea(shapes);
        resizableShapes(shapes);

        double totalDecorativeMaterial = totalDecorativeMaterialForCircle(shapes);
        System.out.println("Total decorative material for circles: " + totalDecorativeMaterial);
    }
}
