package pl.sda.arp4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainTablicaMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablica = new int[6];

        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("podaj elementy tablicy ");
            int element = sc.nextInt();
            tablica[i] = element;
            suma += tablica[i];

        }

        for (int each : tablica) {
            System.out.print(each);
        }
        System.out.println();
        System.out.println("suma" + suma);

        //odwrotna kolejność
        for (int z = tablica.length - 1; z >= 0; z--) {
            System.out.println("odwrotność tablicy " + tablica[z]);

        }

        // szukanie minimum
        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (minimum > tablica[i]) {
                minimum = tablica[i];
            }
        }
        System.out.println("Minimum " + minimum);

        // szukanie maximum
        int maximum = tablica[0];
        int indexMax = 0;
        int j = 0;
        for (j = 1; j < tablica.length; j++) {
            if (maximum < tablica[j]) {
                maximum = tablica[j];
                indexMax = j;
            }
        }
        System.out.println("Maksimum " + maximum + "dla i = " + (j - 1));
        System.out.println("Maksimum Indeks " + indexMax);

        // min i max z tablicy
        int min = tablica[0];
        int max = tablica[tablica.length - 1];

        System.out.println("pierwsze maximum" + max);
        for (int k = 1; k < tablica.length; k++) {
            if (min > tablica[k]) {
                min = tablica[k];
            }
            if (maximum < tablica[k]) {
                max = tablica[k];
            }

        }
        System.out.println("Maksimum to " + max);
        System.out.println("Minimum to " + min);


        // średna arytmetyczna

        double srednia = ((double) suma) / tablica.length;
        System.out.println("srednia " + srednia);

        // ilosc elementów wiekszych od sredniej
        // szukanie maximum

        int licznik = 0;

        for (j = 0; j < tablica.length; j++) {
            if (tablica[j] > srednia) {
                licznik += 1;
            }
        }
        System.out.println("Maksimum " + maximum + "dla i = " + (j - 1));
        System.out.println("Suma szukanych elementów " + licznik);

        // sortowanie i mediana
        Arrays.sort(tablica);
        for (int zmienna : tablica) {

            System.out.println("tablica posortowana " + zmienna);


        }
        int szukana = tablica.length / 2;
        double mediana;
        if (tablica.length%2 == 0){
            int indeksSrodkowy  = tablica.length/2;
            int wartosc1 = tablica[szukana];
            int wartosc2 = tablica[szukana-1];
            mediana = (wartosc1 + wartosc2)/ 2.0;
            System.out.println("mediana " + mediana);

        }
        else{
            System.out.println("mediana " + tablica[szukana]);
        }

    }










    }





