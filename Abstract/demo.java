package Abstract;
abstract class Car{  //must have abstract class for abstract method but not necessary ab. mclass should have abstract methods only
    public abstract void drive(); //declaring and cannot make object
    public abstract void fly();
    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class Wagon extends Car{
    public void drive() {
        System.out.println("Can drive wagon");
    }
}

class Updatedwagon extends Wagon{  //concrete class
    public void fly(){
        System.out.println("Flying in the sky");
    }

}
public class demo {
    public static void main(String[] args) {
        Car obj = new Updatedwagon();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
    
}
