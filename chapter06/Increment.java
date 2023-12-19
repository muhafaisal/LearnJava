package chapter06;

public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call increment, x is " + x);
        increment(x);
        System.out.println("After the call increment, x is "+ x);
    }

    public static void increment(int alfa){
        alfa++;
        System.out.println("Alfa inside method is " + alfa);
    }
}
