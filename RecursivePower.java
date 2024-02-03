/**
 *
 * @author Amy Martinez
 * Chapter 2 PA
 */

import java.util.Scanner;

public class RecursivePower {
//import scanner object for console input

       //method to recursively return base raised to an exponent/power
    public static int power(int base, int power){
        int baseRaisedToExp=0;
        //Base case
        if(power==0){
            return 1;
        }
        //Base case
        if(power == 1){
            return base;
        }
        //recursive call for all other cases of power > 1
        baseRaisedToExp = base * power(base, power-1);
        return baseRaisedToExp;
    }

    public static void main(String[] args) {
        //create Scanner object
        Scanner myScanner = new Scanner(System.in);
        //Console out
        System.out.println("Enter base: ");
        //Get input
        int base = myScanner.nextInt();
        //Console out
        System.out.println("Enter exponent");
        //Get input
        int exponent = myScanner.nextInt();
        int calculatedValue = power(base, exponent);
        System.out.println("Value is: " + calculatedValue);
    }
}
