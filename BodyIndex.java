import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {
        double height,weight;
        Scanner inp = new Scanner (System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = inp.nextDouble();

        double bodyIndexRatio = weight / (height * height) ;

        System.out.print("Vücut Kitle İndeksiniz : " + bodyIndexRatio);


    }
}
