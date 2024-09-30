import java.util.Scanner;

public class DivisionProgram {

    public static double divide(double numerator, double denominator) throws DivisionException {
        if (denominator == 0) {
            throw new DivisionException();
        } else {
            return numerator / denominator;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            double numerator = keyboard.nextDouble();

            System.out.print("Enter denominator: ");
            double denominator = keyboard.nextDouble();

            double result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            keyboard.close();
        }
    }
}
