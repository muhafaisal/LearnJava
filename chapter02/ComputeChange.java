package chapter02;
import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double: ");

        double amount = input.nextDouble();
        input.close();

        int remainingAmount = (int)(amount * 100);
        
        int numberOfOneDollar = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("your amount " + amount + " consists of");
        System.out.println("   " + numberOfOneDollar + " dollars");
        System.out.println("   " + numberOfQuarters + " quarters");
        System.out.println("   " + numberOfDimes + " dimes");
        System.out.println("   " + numberOfNickels + " nickels");
        System.out.println("   " + numberOfPennies + " pennies");
    }
}
