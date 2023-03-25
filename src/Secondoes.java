import java.io.*;

public class Secondoes {
    public static void main(String[] args) {
        String s;
        try {
            FileReader i = new FileReader("Leggi.txt");
            FileWriter o = new FileWriter("scrivi.txt");
            BufferedReader in = new BufferedReader(i);
            //passare al costruttore l'oggetto di tipo FileReader
            BufferedWriter out = new BufferedWriter(o);
            //passare al costruttore l'oggetto di tipo FileWriter
            //in questo modo creo un buffer di scittura e uno di lettura
            //questa volta scriviamo e leggiamo una riga per volta
            s = in.readLine();
            //legge una riga del file fino al carattere a capo
            //escluso il carattere di a capo stesso
            while (s != null) {
                //leggo fino ad arrivare a fine file (EOF) cioè quando leggo NULL
                out.write(s);
                //scrivo la stringa letta nel file scrivi
                out.newLine();
                //metodo che scrive il carattere di a capo
                out.flush();
                //svuota il buffer e mi garantisce che la riga venga scritta
                s = in.readLine();
            }
            i.close();
            o.close();
            //chiudo i file
        } catch (Exception e){}
    }
}
