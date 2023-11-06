class InvalidBoxException extends RuntimeException {
    public InvalidBoxException(String message) {
        super(message);
    }
}
class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new InvalidBoxException("Invalid dimension: Length, width, or height cannot be zero or negative.");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }
}
public class InvalidBoxExceptionDemo {
    public static void main(String[] args) {
        try {
            Box box1 = new Box(3.0, 4.0, 5.0); // Valid dimensions
            System.out.println("Volume of Box 1: " + box1.getVolume());

            // Creating a Box with invalid dimensions (zero or negative)
            Box box2 = new Box(0.0, 4.0, 5.0); // Invalid dimension
        } catch (InvalidBoxException e) {
            System.err.println("InvalidBoxException: " + e.getMessage());
        }
    }
}
