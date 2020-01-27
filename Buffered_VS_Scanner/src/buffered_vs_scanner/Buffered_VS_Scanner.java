package buffered_vs_scanner;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author pizzi.gabriele
 */
public class Buffered_VS_Scanner extends GeneraFile{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        System.out.println("Seleziona l'operazione desiderata: ");
        System.out.println("Premi: \n1 - per generare il file \n2 - per leggere con BufferedReader \n3 - per leggere con Scanner");

        int scelta = in.nextInt();

        switch (scelta) {
            case 1:
                generaFile();
                break;
            case 2:
                readBufferedReader();
                break;
            case 3:
                readScanner();
                break;
            default:
        }

    }

    public static void generaFile() throws IOException {
    Genera();
        System.out.println("Il tuo file è stato crato");
    }
    
    public static void readBufferedReader() {

    }
    
    public static void readScanner() {

    }
    
}
