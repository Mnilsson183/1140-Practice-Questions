package programmingbydoing.keyboard.BMICalc;

import java.util.Scanner;
public class bmiCalc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Your Height in meter: ");
        double height = input.nextDouble();
        System.out.print("Your Height in kilo's: ");
        double weight = input.nextDouble();

        double bmi = weight/(Math.sqrt(height));

        System.out.println("Your BMI is : " + bmi);

    }
}
