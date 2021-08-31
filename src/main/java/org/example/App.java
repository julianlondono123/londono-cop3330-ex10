import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter the price of item 1" );
        int p1 = input.nextInt();;
        System.out.println("Enter the quantity of item 1");
        int q1 = input.nextInt();
        System.out.println( "Enter the price of item 2" );
        int p2 = input.nextInt();;
        System.out.println("Enter the quantity of item 2");
        int q2 = input.nextInt();
        System.out.println( "Enter the price of item 3" );
        int p3 = input.nextInt();;
        System.out.println("Enter the quantity of item 3");
        int q3 = input.nextInt();

        double subtotal = (q1 * p1) + (q2 * p2) + (q3 * p3);
        double tax = (.055 * subtotal);
        double total = tax + subtotal;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }
}
