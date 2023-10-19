package Interface;
//interface shows design, every class is abstract class in it.
//class -> class = extends
//class -> interface = implements
//interface -> interface= extends again


public interface A{
    int age=19;    //final and static variables
    String Name= "Dharmi"; 
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y{

    @Override
    public void show() {
        System.out.println("Show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }

}


public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        
        X obj1 = new B();
        obj1.run();
        // A.Name="John"; //cannot change variable vallue
        System.out.println(A.Name);
    }
}
