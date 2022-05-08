package pl.sda.arp4;
import java.util.Random;

public class MainTablica1 {
    public static void main(String[] args) {
        int[] tablica = new int [10];

        for (int i = 0; i <tablica.length ; i++) {
            int wylosowanaLiczba = new Random().nextInt(21)-10;
            tablica[i] = wylosowanaLiczba;
            
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
            
        }

        for(int resultat: tablica){
            System.out.println("FOR EACH " + resultat);
        }
    }
}
