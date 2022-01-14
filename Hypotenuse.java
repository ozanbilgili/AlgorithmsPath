import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args){

        int a,b;
        double c;

        Scanner inp = new Scanner(System.in);
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextDouble();

        double u = (a + b + c) / 2;

        double area;
        area = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Area of triangel: " + area);

    }
    
}