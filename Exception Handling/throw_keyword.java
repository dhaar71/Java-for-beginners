public class throw_keyword {
    public static void main(String[] args){
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException();
            }
        }catch(ArithmeticException e){
        }
        System.out.println("after exception");
    }
}

