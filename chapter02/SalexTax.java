package chapter02;

import java.util.Scanner;

public class SalexTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        input.close();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $ " + (int)(tax * 100) / 100.0);
    }
}
