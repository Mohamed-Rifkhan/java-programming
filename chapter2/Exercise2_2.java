import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// User input
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		// Calculation
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;

		// output
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}
