package codingProject;

/* Julian Block
Backend challenge */

// initializing my IO and java utilities
import java.io.*; 
import java.util.*;

public class codechallenge1 {

// static global variables
static int zip1;
static int zip2;
static int x;
static int y;
static String choice;
static String result;

// Main method
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
            System.out.println("\n Enter any other series of zipcode baoundaries you'd like too add.");
            System.out.println("Enter the lower range 5 digit zipcode");
            x = inputs.nextInt( );
            System.out.println("Great! now the higher range:");
            y = inputs.nextInt( );
            String answer = compare(x,y);
            System.out.println(answer);
            // algorithm that sets the boundaries of the zipcodes entered by the user
           
               
        } 
   }   
   /* Seperate method containing comparison algorithm for Unit Testing Purposes */
   public static String compare(int x, int y){
        
        if (zip1 < x && x < zip2) {
                  if (zip2 < y){
                     zip2 = y;
                  }
                  String result = "So you can't have any zipcodes outside of " + zip1 + " and " + zip2 ;
                  return result;
               }
               if (x < zip1 && zip1 < zip2 && zip2 < y){
                  zip1 = x;
                  zip2 = y;
                  String result = "So you can't have any zipcodes outside of " + zip1 + " and " + zip2 ;
                  return result;
               }
               if (x < zip1 && zip1 < y && y < zip2){
                  zip1 = x;
                  String result = "So you can't have any zipcodes outside of " + zip1 + " and " + zip2 ;
                  return result;
               }
               if (x < zip1 && zip2 < y){
                  zip1 = x;
                  zip2 = y;
                  String result = "So you can't have any zipcodes outside of " + zip1 + " and " + zip2 ;
                  return result;
               }
               else { 
               String result = "So you can't have any zipcodes outside of " + zip1 + " - " + zip2 + " or " + x + " - " + y ;
               return result;
               }
        }
        }
