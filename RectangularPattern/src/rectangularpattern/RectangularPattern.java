/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
package rectangularpattern;
import java.util.Scanner;

/**
 *  This program displays a rectangular pattern
 *  of asterisks.
 */

public class RectangularPattern
{
   public static void main(String[] args)
   {
      int rows, cols;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of rows and columns.
      System.out.print("How many rows? ");
      rows = keyboard.nextInt();
      System.out.print("How many columns? ");
      cols = keyboard.nextInt();
   
      for (int r = 0; r < rows; r++)
      {
         for (int c = 0; c < cols; c++)
         {
           System.out.print("*");
         }
         System.out.println();
      }
   }
}