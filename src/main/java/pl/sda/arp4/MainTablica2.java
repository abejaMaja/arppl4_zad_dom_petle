package pl.sda.arp4;

import java.util.Scanner;

public class MainTablica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] tablica = new int [10];

        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("podaj elementy tablicy ");
            int element = sc.nextInt();
            tablica [i] = element;
            suma += tablica[i];

        }

        for (int each: tablica) {
            System.out.print(each);
        }
        System.out.println();
        System.out.println("suma" + suma);

    }
}
