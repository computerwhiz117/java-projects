/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nobreaks;
import java.util.Scanner;  // Needed for the Scanner class

/**
 * This program demonstrates a switch statement
 * without any break statements.  
 */

public class NoBreaks
{
   public static void main(String[] args)
   {
      String input; // To hold keyboard input
      char choice;  // To store the user's choice

      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      // Ask the user to enter A, B, or C.
      System.out.print("Enter A, B, or C: ");
      input = keyboard.nextLine();
      choice = input.charAt(0);  // Get the first char
      
      // Determine which character the user entered.
      switch (choice)
      {
         case 'A':
            System.out.println("You entered A.");
            break;
         case 'B':
            System.out.println("You entered B.");
            break;
         case 'C':
            System.out.println("You entered C.");
            break;
         default:
            System.out.println("That's not A, B, or C!");
      }
   }
}