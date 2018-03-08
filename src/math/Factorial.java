package math;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Plea enter the number for Factorial Value: ");
        int i = stdin.nextInt();
        int factorial = 1;
        for(int z = 1; z<=i; z++)
        {
            factorial = factorial*z;
        }
        System.out.println("Factorial of "+i +" is :" +factorial);
    }
}
