import java.util.Scanner;

public class Exercise2_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        //user input
        System.out.println("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        //formula
        double area = radius * radius * PI;
        double volume = area * length;

        //output
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
    
}
