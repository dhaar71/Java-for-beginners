package Overloading;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class demo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int result1 = calculator.add(9, 6);
        int result2 = calculator.add(5, 6, 7);
        
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}



//POLYMORPHISM: Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

//ABSTRACTION: DESIGN ISSUE, HIDING INFORMATION , EXTERNAL WORKING , GAINING INFORMATION


//ENCAPTULATION: COMPILATION ISSUE,WRAPPING UP THE IMPLEMENTATION OF DATA MEMBERS, INTERNAL WORKING, CONTAINING INFORMATION USING GETTERS AND SETTERS
