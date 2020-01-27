package buffered_vs_scanner;

import java.io.*;

/**
 *
 * @author pizzi.gabriele
 */
public class GeneraFile {

    public static void Genera() throws IOException {
        try {
            File fileDiTesto = new File("fileDiTesto.txt");
            FileWriter fw = new FileWriter(fileDiTesto);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Questo è il nostro primo file");
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("Errore: " + e);
            System.exit(1);
            e.printStackTrace();
        }
    }

}
