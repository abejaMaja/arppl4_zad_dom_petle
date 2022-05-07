package pl.sda.arp4;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Metoda dla pętli FOR");

        System.out.println("Podaj licznę całkowitą A: ");
        int a = sc.nextInt();

        System.out.println("Podaj licznę całkowitą B: ");
        int b = sc.nextInt();

        int suma = 0;
        for (int i = a; i <= b ; i++) {
            suma += i;
        }

        System.out.println(suma);

        System.out.println("Metoda dla pętli While");

        System.out.println("Podaj licznę całkowitą A: ");
        int aWhile = sc.nextInt();

        System.out.println("Podaj licznę całkowitą B: ");
        int bWhile = sc.nextInt();

        int suma2 = 0;
        int i = aWhile;
        while (i <= b){
            suma2 += i;
            i++;
        }
        System.out.println(suma2);

        System.out.println("Metoda dla pętli Do - While");

        System.out.println("Podaj licznę całkowitą A: ");
        int aDo = sc.nextInt();

        System.out.println("Podaj licznę całkowitą B: ");
        int bDo = sc.nextInt();

        int suma3 = 0;
        int k = aDo;
        do{
            suma3 += k;
            k++;
        }while (k <= bDo);
        System.out.println(suma3);


    }

}
