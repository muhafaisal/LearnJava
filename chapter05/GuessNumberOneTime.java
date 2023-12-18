package chapter05;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        System.out.print("\nEnter yout guess: ");
        int guess = input.nextInt();
        input.close();

        if (guess == number){
            System.out.println("Yes, the number is " + number);
        } else if (guess > number) {
            System.out.println("Your guess is too high");
        } else {
            System.out.println("Yout guess is tooo low");
        }

    }
}
