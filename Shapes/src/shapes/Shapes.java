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
        String type;
        String choice;
        Scanner shapes = new Scanner(System.in);
        System.out.println("Select the number of rows");
        rows = shapes.nextInt();
        System.out.println("Select the number of columns");
        columns = shapes.nextInt();
        
       
        
        do{
            System.out.println("Please select the type of shape");
            System.out.println("1. Box");
            System.out.println("2. Circle");
            System.out.println("3. X");
            System.out.println("4. Xbox");
            System.out.println("5. Other");
            System.out.println("To exit the program type exit");
            choice = shapes.next(); 
            
        switch(choice)
        {
            case "Box":
                ShapesMethod(rows, columns);
                System.out.println("You are printing a box");
                break;
              
            case "Circle":
                System.out.println("You are printing a circle");
                break;
              
            case "X":
                System.out.println("You are printing an X");
                break;
            case "Xbox":
                System.out.println("You are printing a box with an X inside");
                break;
              
            case "Other":
                System.out.println("You are printing an other shape");
                break;
               
            case "exit":
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Please select a shape");
              
        }
        }while(!choice.equals("exit"));  
          
    }
    
    
    
    static void ShapesMethod(int rows, int columns) {
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < columns; c++)
            {
                System.out.print("*");
            }
            System.out.println();
      }
    }
           
    }
