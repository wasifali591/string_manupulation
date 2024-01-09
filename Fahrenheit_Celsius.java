import java.util.Scanner;

public class Fahrenheit_Celsius{
    public static void main(String[] args) {
        double c, f;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enetr tempareture in Fahrenheit: ");
        f = scan.nextDouble();
        c= (5.0 * (f - 32))/9.0;
        System.out.println("Enetr tempareture in Celsius: " + c);
    }
}