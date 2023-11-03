package programmingbydoing.keyboard.dumbCalc;

import java.util.Scanner;

public class DumbCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first number? ");
        double n1 = input.nextDouble();
        System.out.print("What is your second number? ");
        double n2 = input.nextDouble();
        System.out.print("What is your third number? ");
        double n3 = input.nextDouble();

        double result = (n1 + n2 + n3) / 2;

        System.out.printf("( %4.2f + %4.2f + %4.2f ) / 2 is %4.2f\n", n1, n2, n3, result);
    }
}
