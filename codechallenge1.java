/* Julian Block
Backend challenge */

// initializing my io and java utilities
import java.io.*; 
import java.util.*;

public class codechallenge1 {

//static global variables
static int zip1;
static int zip2;
static String choice;

//Main method
public static void main(String[] args){
   System.out.println("Hello user let's compare some zipodes");
   System.out.println("Enter the lower range 5 digit zipcode in the range:");
   Scanner inputs = new Scanner( System.in );
   zip1 = inputs.nextInt( );
   System.out.println("Great! now the higher range:");
   zip2 = inputs.nextInt( );
   System.out.println("The range of zipcodes we can ship too is: " + zip1 + " - " + zip2);
   System.out.println("Did you want to adjust the ranges we can ship too? (Type Yes or No)");
   choice = inputs.next( );
   if (choice.equals("Yes") || choice.equals("yes")) {
            int x;
            int y;
            System.out.println("\n Enter any other series of zipcode baoundaries you'd like too add.");
            System.out.println("Enter the lower range 5 digit zipcode");
            x = inputs.nextInt( );
            System.out.println("Great! now the higher range:");
            y = inputs.nextInt( );
            
            // algorithm that sets the boundaries of the zipcodes entered by the user
            
               if (zip1 < x && x < zip2) {
                  if (zip2 < y){
                     zip2 = y;
                  }
                  System.out.println("So you can't have any zipcodes outside of " + zip1 + " and " + zip2 );
               }
               if (x < zip1 && zip1 < zip2 && zip2 < y){
                  zip1 = x;
                  zip2 = y;
                  System.out.println("So you can't have any zipcodes outside of " + zip1 + " and " + zip2 );
               }
               if (x < zip1 && zip1 < y && y < zip2){
                  zip1 = x;
                  System.out.println("So you can't have any zipcodes outside of " + zip1 + " and " + zip2 );
               }
               else { 
               System.out.println("So you can't have any zipcodes outside of " + zip1 + " - " + zip2 + " or " + x + " - " + y );
               }
        } else {
        }     
   }
   }