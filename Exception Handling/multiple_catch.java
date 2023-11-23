public class multiple_catch {
    public static void main(String[] args) {
        int i,j;
        i=1;
        int nums[]= new int[5];
        try{
            j=18/i;
            System.out.println(nums[8]);
            
        } 
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of index");
        } 
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("After exception handling.");
    }
}
