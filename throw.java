public class throw {
    public static void main(String[] args){
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException();
                System.out.println("Division by zero is not allowed");
            }
        }catch(ArithmeticException e){
        }
        System.out.println("after exception");
    }
}

