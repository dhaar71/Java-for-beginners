class A //every class in java extends object class 
{ //super class : The super keyword in Java is a reference variable which is used to refer immediate parent class object.
    public A(){
        super();
        System.out.println("A");
    }
    public A(int n){
        super();
        System.out.println("in A :"+n);
    }
}

class B extends A{
    public B(){
        super(); //calling public A()
        System.out.println("B");
    }
    public B(int n){
        super(n);
        System.out.println("in B :"+n);
    }
}

public class demo {
    public static void main(String[] args){
        B obj= new B(5);
        B obj2 = new B();
        System.out.println(obj);
        System.out.println(obj2);
    }
}
