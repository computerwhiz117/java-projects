/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretword;
import java.util.Scanner;  // Needed for the Scanner class

/**
 * This program demonstrates a case-insensitive string comparison.
 */

public class SecretWord
{
   public static void main(String[] args)
   {
      String input;    // To hold the user's input
      final String SECRET = "PROSPERO";

      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      // Prompt the user to enter the secret word.
      System.out.print("Enter the secret word: ");
      input = keyboard.nextLine();

      // Determine if the user entered the secret word.
      if (input.equalsIgnoreCase("PROSPERO"))
      {
         System.out.println("Congratulations! You know the "
                            + "secret word!");
      }
      else
      {
         System.out.println("Sorry, that is NOT the "
                            + "secret word!");
      }
   }
}