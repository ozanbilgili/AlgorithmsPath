import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
	double n1,n2;
    int selected;
    Scanner inp=new Scanner(System.in);

    System.out.print("First Number Input :");
    n1=inp.nextInt();
    System.out.print("Second Number Input :");
    n2=inp.nextInt();
    System.out.println("1-Total\n2-Substract\n3-Multiply\n4-Divide");
    selected=inp.nextInt();


    switch (selected){
        case 1 :
            System.out.println("Total : "+(n1 + n2));
            break;
        case 2 :
            System.out.println("Substract : "+(n1 - n2));
            break;
        case 3 :
            System.out.println("Multiply : "+(n1 * n2));
            break;
        case 4 :
            System.out.println("Dived : "+(n1 / n2));
            break;
        default :
            System.out.println("Invalid Character!");

    }

    }
}
