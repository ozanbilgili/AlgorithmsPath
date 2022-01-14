
import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        int baslangicTutari = 10; //acilis ucreti
        int minTutar = 20; //if icinde de kullanilabilir

        double kmBasinaTutar = 2.20;

        System.out.println("Gidilecek km?: ");
        int gidilenKm = scanner.nextInt(); //kullanıcıdan km bilgisini aliyorum.

        double toplamTutar = gidilenKm * kmBasinaTutar + baslangicTutari ;

        
        toplamTutar = (toplamTutar < 20) ? 20 : toplamTutar; //20'den küçük ise; ? ile durumun true yada false olmasını bekliyoruz, true ise 20 yap değilse toplam tutari yap
        System.out.println("Toplam borcunuz: " + toplamTutar);


    }
}