import java.util.Scanner;

public class Exercise2_4 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the driving distace: ");
		double distace = input.nextDouble();
		
        System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
        System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();

        //calculte
        double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

		// output
		System.out.println("The cost of driving is $" + costOfDriving);
    }
}

