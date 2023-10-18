package special;

import java.util.Scanner;
public class gravel {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Stoney Gravel Pit!" + '\n');

        System.out.print("Please enter the weight of gravel required: ");

        double weight;

        while(true){
            try{
                weight = input.nextDouble();
                if(weight > 0){
                    break;
                }
            }
            catch(Exception e){

            }
        }

        System.out.printf("Do you require delivery (Y/N)? ");

        char delivery_c;
        int delivery;

        while(true){
            try{
                delivery_c = input.next().charAt(0);
                if(delivery_c == 'y' || delivery_c == 'Y'){
                        delivery = 1;
                        break;
                    } else if(delivery_c == 'n' || delivery_c == 'N'){
                        delivery = 0;
                        break;
                    }
            }
            catch(Exception e){

            }
        }
        
        double price;

        if(weight < 1000){
            price = 1.39;
        } else if(weight <= 1999){
            price = 1.29;
        } else if(weight <= 2999){
            price = 1.14;
        } else if(weight <= 3999){
            price = 0.99;
        } else if(weight <= 4999){
            price = 0.85;
        } else{
            price = 0.80;
        }

        int deliveryFee;

        if(weight < 4800){
            deliveryFee = 1;
        } else{
            deliveryFee = 0;
        }

        System.out.printf("The charge for %.2f lb of gravel is $%.2f per lb\n", weight, price);

        double subtotal = price * weight;
        System.out.printf("Subtotal:     $%7.2f\n", subtotal);

        double deliveryCost = Math.round(0.0300 * subtotal * delivery * 100d) / 100d;
        if (deliveryFee == 0){
            deliveryCost = 0;
        }

        System.out.printf("Delivery:     $%7.2f", deliveryCost);
        if (deliveryFee == 0 && (deliveryCost != 0)){
            System.out.printf("(free delivery)");
        }
        System.out.printf("\n");

        double gst = 0.0500 * (subtotal + deliveryCost);
        System.out.printf("GST:          $%7.2f\n", gst);
        System.out.printf("--------------------------\n\n");
        double total = Math.round((subtotal + deliveryCost + gst) * 100) / 100d;
        System.out.printf("Total: %7.2f\n\n", total);
        System.out.println("Thank you for your purchase! We hope your day rocks.");
    }
}
