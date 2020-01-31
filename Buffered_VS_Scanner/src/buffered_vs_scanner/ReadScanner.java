package buffered_vs_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author pizzi.gabriele
 */
public class ReadScanner {

    public static void readScanner() throws FileNotFoundException {
        //creating File instance to reference text file in Java
        File text = new File("C:/temp/test.txt");

        //Creating Scanner instnace to read File in Java
        Scanner scnr = new Scanner(text);

        //Reading each line of file using Scanner class
        int lineNumber = 1;
        while (scnr.hasNextLine()) {
            String line = scnr.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }
    }
}
