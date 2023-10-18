public class multiple_catch {
    public static void main(String[] args) {
        int i=1;
        int j;
        int nums[]= new int[5];
        String str= null;
        try{
            j=18/i;
            System.out.println(nums[8]);
            System.out.println(str.length());
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
