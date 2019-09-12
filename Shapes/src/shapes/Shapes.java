/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int rows, columns;
       Scanner shapes = new Scanner(System.in);
       System.out.println("Select your shape");
       String type = shapes.nextLine();
       System.out.println("Select the number of rows");
       rows = shapes.nextInt();
       System.out.println("Select the number of columns");
       columns = shapes.nextInt();
       
       System.out.println("You are printing a box");
       
     for (int r = 0; r < rows; r++)
     {
         for (int c = 0; c < columns; c++)
         {
             System.out.print("*");
         }
         System.out.println();
     }


