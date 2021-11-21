import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class ReplaceJava {
    public static void main (String[] args) throws IOException {
        File inputFile = new File(args[0]);
        File outputFile = new File("output.txt");
        Scanner input1 = new Scanner(inputFile);
        Scanner input2 = new Scanner(inputFile);
        PrintWriter output = new PrintWriter(outputFile);
        copy(input1, output);
        replace(input2, output);
        input1.close();
        input2.close();
        output.close();
    }

    public static void copy(Scanner input, PrintWriter output){
        while (input.hasNextLine()){
            String line = input.nextLine();
            output.println(line);
        }
        output.println();
        output.println();
    }

    public static void replace(Scanner input, PrintWriter output){
        while(input.hasNext()){
            String word = input.next();
            if (word.matches("Java.?")){
                word = word.replace("Java","HTML");
            }
            word += " ";
            if (word.matches(".*[.?!]\\s")){
                word += "\n\n";
            }
            output.print(word);
        }
    }
}
