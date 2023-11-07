import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTextReplacement {
    public static void main(String[] args) {
        String inputFile = "find.txt"; // Input file name
        String outputFile = "replace.txt"; // Output file name

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word to be replaced: ");
        String searchWord = scanner.nextLine();
        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                // Replace the target word with the replacement word
                String modifiedLine = line.replace(searchWord, replacementWord);
                writer.println(modifiedLine);
            }

            reader.close();
            writer.close();

            System.out.println("File modified and saved as " + outputFile);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
