import java.util.Scanner;

public class Weather {

    public static void main(String[] args){
        int sicaklik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sıcaklığı giriniz: ");
        sicaklik = inp.nextInt();
        int i = 0;

        if(sicaklik < 5.0){
            System.out.println("Kayak");
        }
        else if(sicaklik < 15.0 && sicaklik > 5.0){
            System.out.println("Sinema");
        }
        else if(sicaklik > 15.0 && sicaklik < 25.0){
            System.out.println("Piknik");
        }
        else {
            System.out.println("Yüzme");
        }

    }
    
}