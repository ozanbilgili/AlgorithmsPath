import java.lang.reflect.Array;
import java.util.Scanner;

public class ForceNumber{

    public static void main(String[] args) {
        
        int n; 
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz: ");

        n = input.nextInt();

        for (int i = 1; i<=n; i*=4){

            System.out.println("4'e kadar olan katları: " + i);   
        }
        for (int t = 1; t<=n; t*=5){
            System.out.println("5'e kadar olan katları: " + t);
            }
    }
}