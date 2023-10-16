package Inheritance;

class Shapes{
    void area(){
        System.out.println("I am in shapes");
    }
}

class Triangle extends Shapes{
    void area(){
        System.out.println("Area is 1/2*base*height");
    }
}

class Circle extends Shapes{
    void area(){
        System.out.println("Area is pie*r*r");
    }
}

class Square extends Shapes{
    void area(){
        System.out.println("Area is side*side");
    }
}

public class multiple {
    public static void main(String args[]){
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        shape.area();
        square.area();
        triangle.area();
        circle.area();
    }
    

}
