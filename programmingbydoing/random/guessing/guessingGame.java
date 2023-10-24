package programmingbydoing.random.guessing;
/*
 * https://programmingbydoing.com/a/a-number-guessing-game.html
 */

import java.util.Scanner;
class guessingGame{
    public static void main(String[] args){
        System.out.println("I'm thinking of a number from 1 to 10.");

        Scanner input = new Scanner(System.in);
        System.out.print("Your guess: ");
        int guess = input.nextInt();

        int answer = (int)(Math.random()*9) + 1;
        if(guess == answer){
            System.out.printf("That's right!  My secret number was %d!\n", guess);
            return;
        }
        System.out.printf("Sorry, but I was really thinking of %d.\n", answer);

    }
}