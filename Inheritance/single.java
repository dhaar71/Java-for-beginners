package Inheritance;


class Box {
    int length;
    int breadth;
    int height;

    Box() {
        length = -1;
        breadth = -1;
        height = -1;
    }

    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
}

class BoxPrice extends Box {
    double price;

    BoxPrice() {
        price = 134.76;
    }

    BoxPrice(double price) {
        this.price = price;
    }
}

class BoxSell extends BoxPrice {
    public static int boxSellCount;

    // BoxSell() {
    //     // Initialize the boxSellCount to 0 when a BoxSell object is created
    //     boxSellCount = 0;
    // }

    // This method increments the boxSellCount
    void sellBox() {
        boxSellCount++;
    }
}

public class single {
    public static void main(String[] args) {
        // Create a Box object
        Box box = new Box(10, 5, 3);
        Box box2= new Box();

        // Create a BoxPrice object
        BoxPrice boxPrice = new BoxPrice(20.0);
        BoxPrice boxprice2 = new BoxPrice();

        // Create a BoxSell object
        BoxSell boxSell = new BoxSell();
        

        // Call the sellBox method to increment boxSellCount
        boxSell.sellBox();
        

        // Print the box information
        System.out.println("Box dimensions: " + box.length + "x" + box.breadth + "x" + box.height);

        // Print the box price
        System.out.println("Box price: $" + boxPrice.price);

        System.out.println("Box dimensions: " + box2.length + "x" + box2.breadth + "x" + box2.height);
        System.out.println("Box price: $" + boxprice2.price);

        // Print the number of boxes sold
        System.out.println("Number of boxes sold: " + BoxSell.boxSellCount);
    }
}
