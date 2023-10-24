import java.util.Scanner;

class guess{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int AMOUNT_OF_ATTEMPTS = 10;
        int RANGE_OF_GUESS = 100;
        System.out.println("Welome to the guessing game");

        System.out.printf("You have %d amount of attempts\n", AMOUNT_OF_ATTEMPTS);
        int number = (int)(Math.random() * RANGE_OF_GUESS) + 1;

        int guess = -1;
        
        for(/* init left blank */; AMOUNT_OF_ATTEMPTS > 0; --AMOUNT_OF_ATTEMPTS){
            guess = input.nextInt();
            
            if(guess == number){
                System.out.printf("You Win number is %d\n", number);
                return;
            } else if(guess > number){
                System.out.printf("TOO HIGH\n");
            } else if(guess < number){
                System.out.printf("TOO LOW\n");
            }
        }

        if(AMOUNT_OF_ATTEMPTS == 0){
                System.out.printf("Number is %d\n", number);
        }
    }
}