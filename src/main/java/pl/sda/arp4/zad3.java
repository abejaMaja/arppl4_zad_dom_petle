package pl.sda.arp4;

import java.util.Scanner;
import java.lang.Math;

public class zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj licznę całkowitą dodatnią");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int result = (int)Math.pow(i, 2);
            if (result <= n) {
                System.out.println(result);
            }

        }

        System.out.println("Bez użycia metody Math");
        System.out.println("Podaj licznę całkowitą dodatnią");
        int m = sc.nextInt();


        int result = 1;
        for (int i = 0; i <= m; i++) {
            result = i * i;
            if (result <= n) {
                System.out.println(result);
            }

        }
        System.out.println("Druga opcja Bez użycia metody Math");
        System.out.println("Podaj licznę całkowitą dodatnią");
        int k = sc.nextInt();

        for(int wynik = 1; wynik < k; wynik *= 2){
            if (wynik <= k) {
                System.out.println(wynik);
            }

        }

    }
}
