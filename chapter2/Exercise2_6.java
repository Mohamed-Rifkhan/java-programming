import java.util.Scanner;

public class Exercise2_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);	
		final double MONTHLY_INTEREST_RATE = 0.00417;

        // user input
        System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();

        //calculation for 1st month
        double total = 100 * (1 + MONTHLY_INTEREST_RATE);

        //2nd month
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

        //3rd month
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

        //4th month
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

        //5th month
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

        //6th month
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

        //output
        System.out.println("After the sixth month, the account valuse is " + total);
    }
}


