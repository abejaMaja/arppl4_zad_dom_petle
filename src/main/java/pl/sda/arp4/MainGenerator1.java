package pl.sda.arp4;

import java.util.Arrays;
import java.util.Random;

public class MainGenerator1 {
    public static void main(String[] args) {
        int[] tablica1 = new int[100];
        for (int i = 0; i < tablica1.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(50);
            tablica1[i] = wylosowanaLiczba;
            System.out.print(tablica1[i] + " ");


        }
        System.out.println();

        for (int i = 0; i < tablica1.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(901)+100;
            tablica1[i] = wylosowanaLiczba;
            System.out.print(tablica1[i] + " ");
        }
        System.out.println();

        int[] tablica2 = new int[1000];
        for (int i = 0; i < tablica2.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(5201)-200;
            tablica2[i] = wylosowanaLiczba;
            System.out.print(tablica2[i] + " ");
        }
        System.out.println();


        int[] tab = new int[10];
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            int los = new Random().nextInt(10);
            tab[i] = los;
            System.out.print(tab[i] + " ")
            ;
            if (tab[i]== 5){
                licznik++;
            }

        }

        System.out.println("Licznik = " + licznik);









        System.out.println();
        int[] tablica = new int[20];
        int licznik2 = 0;
        int licznik4 = 0;
        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(5)+1;
            tablica[i] = wylosowanaLiczba;
            if (wylosowanaLiczba == 2){
                licznik2 = licznik2+1;
            }
            if (wylosowanaLiczba == 4){
                licznik4 = licznik4+1;
            }
        }
        System.out.println(Arrays.toString(tablica));
        System.out.println("Liczba 2 wyszla: " + licznik2 + " razy");
        System.out.println("Liczba 4 wyszla: " + licznik4 + " razy");













    }
}
