
import Packages.calculator.advcalc; 
import Packages.calculator.calc;


public class demo  {

    public static void main(String args[]){

        calc obj1= new calc();
        advcalc obj2= new advcalc();
        System.out.println(obj1.greet());
        System.out.println("Sum: ");
        System.out.println(obj1.add(12, 90));
        System.out.println("Difference: ");
        System.out.println(obj1.sub(12, 9));
        System.out.println(obj2.greeting());
        System.out.println("Multiplication: ");
        System.out.println(obj2.multi(567843 , 98765)) ;
        System.out.println("Division: ");
        System.out.println(obj2.div(12, 9) );
        
    }
    
}
