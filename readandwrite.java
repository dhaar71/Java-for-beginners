import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readandwrite {
    public static void main(String[] args) {
        // creqte new file
        try{
            File myfile = new File("sampletext.txt");
            myfile.createNewFile();
        } catch(IOException e){
            System.out.println("Enable to create file");
        }
        // code to write a file
        try{
            FileWriter fileWriter = new FileWriter("sampletext.txt");
            fileWriter.write("First file writing in java");
            fileWriter.close();

        } catch(IOException e){
            System.out.println("Error occurred while writing the file."+ e);
        }

        //Reading file
        File myfile = new File("sampletext.txt");
        try{
            Scanner sc= new Scanner(myfile);
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("The specified file was not found.");
        }

    }
}
