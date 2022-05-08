package pl.sda.arp4;

import java.util.Random;

public class MainFunkcje {
    public static void main(String[] args) {
        int[] tab = new int[] {1, 2, 3, 4, 5} ;
        int suma = sumujElementy(tab);
        System.out.println("Suma " + suma);
        int minimum = minElement(tab);
        System.out.println("Minimum " + minimum);
        int maximum = maxElement(tab);
        System.out.println("Maximum " + maximum);
        int indexMax = indexMax(tab);
        System.out.println("Index Max " + indexMax);
        double srednia = srednia(tab);
        System.out.println("Średnia " + srednia);
        int iloscElementow = iloscElementowWiekszychOdSredniej(tab);
        System.out.println("Ilość elementów większych od średniej " + iloscElementow);
        System.out.print("Odwrotna kolejność tablicy ");
        odwrotnaKolejnosc(tab);
        double mediana = mediana (tab);
        System.out.println("Mediana " + mediana);


    }

    private static int sumujElementy(int[] tablica){
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            // tablica[i] to wartość (liczba) w komórce
            suma = suma + tablica[i];
        }
        return suma;

    }

    private static int minElement(int[] tablica){
        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (minimum > tablica[i]) {
                minimum = tablica[i];
            }
        }
        return minimum;
    }

    private static int maxElement(int[] tablica){
        int maximum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (maximum < tablica[i]) {
                maximum = tablica[i];
            }
        }
        return maximum;

    }

    private static int indexMax(int[] tablica){
        int maximum = tablica[0];
        int indexMax = 0;
        for (int i = 1; i < tablica.length; i++) {
            if (maximum < tablica[i]) {
                indexMax = i;
            }
        }
        return indexMax;

    }

    private static double srednia(int[] tablica){
        double suma = sumujElementy(tablica);
        double srednia =  suma / tablica.length;
        return srednia;

    }

    private static int iloscElementowWiekszychOdSredniej(int[] tablica){
        int licznik = 0;
        for (int j = 0; j < tablica.length; j++) {
            if (tablica[j] > srednia(tablica)) {
                licznik += 1;
            }
        }
        return licznik;

    }

    private static void odwrotnaKolejnosc(int[] tablica){
        for (int z = tablica.length - 1; z >= 0; z--) {
            System.out.print(tablica[z] + " ");

        }
    }

    private static double mediana(int[] tablica){
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
            mediana = tablica[szukana];
            System.out.println("mediana " + mediana);
        }
        return mediana;

    }












}




