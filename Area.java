import java.util.Scanner;
import java.lang.Math;
public class Area {
    public static void main(String[] args) {
        int a, b , c;
        double s, area;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the three sides: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        s = (a + b + c) / 2;

        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle: " + area);
    }
}
