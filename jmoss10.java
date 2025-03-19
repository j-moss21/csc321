//Julen Moss
//
import java.util.Scanner;

public class jmoss10 {

    public static double calculateArea(double radius, double height) {

        return 2 * Math.PI * radius * (radius + height);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

       System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double area = calculateArea(radius, height);

        System.out.printf("The area of the cylinder is: %.2f%n", area);

        scanner.close();
    }
}
