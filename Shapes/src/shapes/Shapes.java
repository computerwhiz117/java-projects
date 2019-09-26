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
            System.out.println("To exit the program type exit");
            choice = shapes.next(); 
            
        switch(choice)
        {
            case "Box":
                ShapesMethod(rows, columns);
                System.out.println("You are printing a box");
                break;
              
            case "Circle":
                PrintPattern(radius);
                System.out.println("You are printing a circle");
                break;
              
            case "X":
                pattern(len);
                System.out.println("You are printing an X");
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
        
        // function to print circle pattern 
    static void printPattern(int radius) { 
  
    // dist represents distance to the center 
    double dist; 
  
    // for horizontal movement 
    for (int i = 0; i <= 2 * radius; i++) { 
  
    // for vertical movement 
    for (int j = 0; j <= 2 * radius; j++) { 
        dist = Math.sqrt((i - radius) * (i - radius) + 
                         (j - radius) * (j - radius)); 
  
        // dist should be in the range (radius - 0.5) 
        // and (radius + 0.5) to print stars(*) 
        if (dist > radius - 0.5 && dist < radius + 0.5) 
        System.out.print("*"); 
        else
        System.out.print(" "); 
    } 
  
    System.out.print("\n"); 
    }
}
    
// Function to print given  
// string in cross pattern 
static void pattern(String str, 
                    int len) 
{ 
      
    // i and j are the indexes  
    // of characters to be  
    // displayed in the ith  
    // iteration i = 0 initially  
    // and go upto length of string 
    // j = length of string initially  
    // in each iteration of i,  
    // we increment i and decrement j, 
    // we print character only  
    // of k==i or k==j 
    for (int i = 0; i < len; i++) 
    { 
        int j = len - 1 - i; 
        for (int k = 0; k < len; k++) 
        { 
            if (k == i || k == j) 
                System.out.print(str.charAt(k)); 
            else
                System.out.print(" "); 
        } 
        System.out.println(""); 
    } 
  } 
}
