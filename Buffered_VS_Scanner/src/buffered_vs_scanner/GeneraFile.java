package buffered_vs_scanner;

import java.io.*;

/*
   @author pizzi.gabriele
 */
public class GeneraFile {

    public static void Genera() throws IOException {
        try {
            File fileDiTesto = new File("fileDiTesto.txt");
            FileWriter fw = new FileWriter(fileDiTesto);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 100000; i++) {
                for (int j = 0; j < 5; j++) {
                int numeri = (int) (Math.random()*254);
                String chiappa;
                chiappa = Integer.toString(numeri);
                bw.write(chiappa);
                }
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("Errore: " + e);
            System.exit(1);
            e.printStackTrace();
        }
    }
}