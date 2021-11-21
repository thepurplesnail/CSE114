import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ReformatCode {
    public static void main(String args[]){
        try {
            File file = new File(args[0]);
            File outputFile = new File("Output.java");
            Scanner input1 = new Scanner(file);
            PrintWriter output1 = new PrintWriter(outputFile);
            reformat(input1, output1);

            Scanner input2 = new Scanner(outputFile);
            PrintWriter output2 = new PrintWriter(file);
            copy(input2, output2);
            outputFile.delete();
        } catch (IOException ex){
            System.err.println(ex);
        }


    }
    public static void reformat(Scanner input, PrintWriter output){
        while (input.hasNext()){
            boolean newLine = true;
            String line = input.nextLine();
            if (line.matches(".+\\)") || line.matches(".+Test"))
                line += "{";

            if (line.matches("[\\s]*\\{")){
                line = "";
            }

            if (line.equals(""))
                newLine = false;

            line += "\n";

            if (newLine)
                output.println(line);
        }
        input.close();
        output.close();
    }
    public static void copy(Scanner input, PrintWriter output){
        while (input.hasNext()){
            String line = input.nextLine();
            output.println(line);
        }
        input.close();
        output.close();
    }

}
