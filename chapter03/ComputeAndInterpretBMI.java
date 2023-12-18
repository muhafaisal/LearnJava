package chapter03;
import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        input.close();

        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;

        double weightInKilogram = weight * KILOGRAM_PER_POUND;
        double heightInMeter = height * METER_PER_INCH;
        double bmi = weightInKilogram / (heightInMeter * heightInMeter);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else 
            System.out.println("Obese");
    }
}
