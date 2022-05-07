package pl.sda.arp4;

import java.util.Scanner;
import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        int n = new Random().nextInt(100); ;
        Scanner sc = new Scanner(System.in);

        int shoot = 0;
        while (shoot != n){
            System.out.println("Podaj licznę którą mam na myśli: ");
            shoot = sc.nextInt();
            if (shoot > n) {
                System.out.println("Podałeś za dużą liczbę");
            }
            else if (shoot < n){
                    System.out.println("Podałeś za małą liczbę");
            }


        }
        System.out.println("Brawo wygrałeś, liczba którą wylosowałem to " + shoot );

    }
}
