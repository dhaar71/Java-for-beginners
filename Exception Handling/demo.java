public class demo {
    public static void main(String[] args) {
        
        int i=0;
        int j=0;
        try{
            j=18/i;
        } catch(Exception e){
            System.out.println("something went wrong");
        }
        System.out.println("after execution of 18/0");
    }
}
