import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = -1;
        double height = -1;

        // Get the width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width <= 0) {
                    System.out.println("Width must be a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        } while (width <= 0);

        // Get the height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        } while (height <= 0);

        // Calculate the area of the rectangle
        double area = width * height;

        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (width + height);

        // Calculate the length of the diagonal using Pythagorean theorem
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        // Output the results
        System.out.println("\n--- Results ---");
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);

        scanner.close();
    }
}
