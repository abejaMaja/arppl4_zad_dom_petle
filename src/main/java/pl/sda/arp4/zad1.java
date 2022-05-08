package pl.sda.arp4;

public class zad1 {
    public static void main(String[] args) {

        System.out.println("Liczby parzyste: ");
        for (int i = -100; i <= 100 ; i++) {
            if (i % 2 == 0 ){
                System.out.print(i + " ;");
            }
        }

        System.out.println("litery od 'a' do 'z' ");
        for (char i = 'b'; i <= 'z' ; i++) {
            System.out.println(i);
        }

        System.out.println("litery od 'A' do 'Z' ");
        for (char i = 'A'; i <= 'Z' ; i+=2) {
            System.out.println(i);
        }

        System.out.println("litery od 'a' do 'z' co druga, podzielna przez 5 ");
        for (char i = 'b'; i <= 'z' ; i++) {
            if(i % 5 ==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
