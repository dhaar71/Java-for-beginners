public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer Try Block: Before Exception");

            try {
                // Nested try block 1
                int[] array = new int[3];
                int result = array[4]; // This will throw an ArrayIndexOutOfBoundsException
                System.out.println("Nested Try Block 1: This line will not be executed");
                System.out.println(result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Nested Try Block 1: Caught ArrayIndexOutOfBoundsException");
            }

            try {
                // Nested try block 2
                String str = null;
                int strLength = str.length(); // This will throw a NullPointerException
                System.out.println("Nested Try Block 2: This line will not be executed");
            } catch (NullPointerException e) {
                System.err.println("Nested Try Block 2: Caught NullPointerException");
            }

            System.out.println("Outer Try Block: After Exception");
        } catch (Exception e) {
            System.err.println("Outer Try Block: Caught Exception");
        }

        System.out.println("After Nested Try-Catch Blocks");
    }
}
