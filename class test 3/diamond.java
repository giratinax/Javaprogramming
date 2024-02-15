import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();
        
        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            int spaces = Math.abs(i - rows / 2);
            int stars = rows - 2 * spaces;
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
    }
}
