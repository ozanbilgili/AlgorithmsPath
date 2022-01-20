import java.util.Scanner;

public class Ustel {
    
    public static void main(String[] args) {
        
        int n,k; 
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("Lütfen üstü giriniz: ");
        k = input.nextInt();

        int total = 1;

        for (int i = 1; i<=k; total *=n){
            i++;
        }

            System.out.print("Sonuç: " + total);
    }
}
