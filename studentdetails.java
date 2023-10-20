import java.io.*;
import java.util.Scanner;

public class studentdetails {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Studentdetails.txt", true));
             Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number of the Students:");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter the name of the student:");
                String name = scanner.nextLine();
                System.out.println("Enter the marks of the student:");
                int m = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                // Write student data with a comma delimiter
                bw.write(name + "," + m);
                bw.newLine(); // Add a newline character to separate entries
            }
            System.out.println("Records saved");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
