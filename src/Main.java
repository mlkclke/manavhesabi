import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int armut , elma ,domates , muz , patlıcan  ;
       double tutar ;
       double perArmut = 2.14 ;
       double perElma = 3.67 ;
       double perDomates = 1.11 ;
       double perMuz = 0.95 ;
       double perPatlıcan = 5.00 ;

       Scanner input = new Scanner(System.in);
       System.out.println("Armut Kaç Kilo ? : ");
       armut = input.nextInt();
       System.out.println("Elma Kaç Kilo ? :");
       elma = input.nextInt();
       System.out.println("Domates Kaç Kilo ? :");
       domates = input.nextInt();
       System.out.println("Muz Kaç Kilo ? :");
       muz = input.nextInt();
       System.out.println("Patlıcan Kaç Kilo ? :");
       patlıcan = input.nextInt();


       tutar = (perElma + perArmut + perDomates + perMuz + perPatlıcan );
       System.out.println("Toplam Tutar :" + tutar);

    }
}