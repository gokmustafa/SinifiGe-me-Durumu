import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int Matematik, Fizik, Turkce, Kimya, Muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        Matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        Fizik = input.nextInt();
        System.out.print("Turkce notunuzu giriniz:");
        Turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        Kimya = input.nextInt();
        System.out.print("Muzik notunuzu giriniz:");
        Muzik = input.nextInt();
        int Ortalaman=(Matematik+ Fizik+ Turkce+ Kimya+ Muzik)/5;
        System.out.println("Ortalaman="+Ortalaman);

        if (Ortalaman>=55){
            System.out.println("Geçtin !");
        } else{
            System.out.println("Kaldın");
        }

   }
}
