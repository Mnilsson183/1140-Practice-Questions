import java.util.Scanner;



class bank{

    static double balance = 0;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome to your banking application");

        System.out.printf("Please select an option\n");
        System.out.println("    1) Deposit");
        System.out.println("    2) Withdraw");
        System.out.println("    3) Check balance");
        System.out.println("    4) exit");

        int option = input.nextInt();
        if(option <= 0 || option > 4){
            System.out.println("not an option I am exiting for you");
            close(input);
            return;
        }

        if(option == 1){
            deposit();
        } else if(option == 2){
            withdraw();
        } else if(option == 3){
            checkBalance();
        } else if(option == 4){
            System.out.println("Good bye");
            close(input);
            return;
        }

        close(input);
    }
    private static void deposit(){
        Scanner input = new Scanner(System.in);
        System.out.print("How much would you like to deposit: ");
        double deposit = input.nextDouble();
        if(deposit <= 0){
            System.out.println("You cannot deposit that amount");
            close(input);
            return;
        }
        updateBalance(deposit);
        System.out.printf("Your balance is now %.2f\n", getBalance());
        close(input);
    }

    private static void withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.print("How much would you like to withdraw: ");
        double withdraw = input.nextDouble();
        double balance = getBalance();
        if(withdraw <= 0){
            System.out.printf("You can't withdraw that amount of money");
            close(input);
            return;
        } else if(withdraw > balance){
            System.out.println("You are attempting to take out more money than you have");
            close(input);
            return;
        }
        updateBalance(withdraw * -1);
        System.out.printf("Your balance is now %.2f\n", getBalance());
        close(input);
    }

    private static void checkBalance(){
        System.out.printf("You balance is %.2f\n", getBalance());
    }

    private static void updateBalance(double val){
        balance = balance + val;
    }
    private static double getBalance(){
        return balance;
    }
    private static void close(Scanner scanner){
        scanner.close();
    }
}