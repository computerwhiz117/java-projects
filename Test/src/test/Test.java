package test;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Carlos
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int rows, columns, radius, len;
        
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String type;
        String filename;
        String choice;
        Scanner shapes = new Scanner(System.in);
        
        do{
            System.out.println("Please select the type of shape");
            System.out.println("1. Box");
            System.out.println("2. Circle");
            System.out.println("3. X");
            System.out.println("To exit the program type exit");
            choice = shapes.next(); 
            
        switch(choice) //pass the filename to the functions
        {
            case "Box":
                System.out.print("Enter the filename");
                filename = shapes.nextLine();
                System.out.println("Select the number of rows");
                rows = shapes.nextInt();
                System.out.println("Select the number of columns");
        columns = shapes.nextInt();
                ShapesMethod(rows, columns); //pass filename
                System.out.println("You are printing a box");
                break;
              
            case "Circle":
                System.out.print("Enter the filename");
                filename = shapes.nextLine();
                System.out.println("Select the number of radius");
                radius = shapes.nextInt();
                printPattern(radius); //passfilename
                System.out.println("You are printing a circle");
                break;
              
            case "X":
                System.out.print("Enter the filename");
                filename = shapes.nextLine();
                System.out.println("Select the type of length");
                len = shapes.nextInt();
                pattern(len); //pass filename
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
    
    
    
    static void ShapesMethod(int rows, int columns) {  //circle function. PASS the filename
        
        String shape = "";
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < columns; c++)
            {
                shape += "*";
                //System.out.print("*");
            }
            shape += "\n";
            System.out.println();
      }    }
        
         //function to print circle pattern 
    static void printPattern(int radius) { //call the file function at the END of this function, and pass the file name
  
        //dist represents distance to the center 
        double dist; 
  
        String shape = "";
        //for horizontal movement 
        for (int i = 0; i <= 2 * radius; i++) { 
  
            //for vertical movement 
            for (int j = 0; j <= 2 * radius; j++) { 
                dist = Math.sqrt((i - radius) * (i - radius) + 
                    (j - radius) * (j - radius)); 
  
            //dist should be in the range (radius - 0.5) 
            //and (radius + 0.5) to print stars(*) 
            if (dist > radius - 0.5 && dist < radius + 0.5) 
                //System.out.print("*");
                shape += "*";
            else
                //System.out.print(" "); 
                shape += "/n";
            
            
            } 
  
    //System.out.print("\n");
    System.out.println();
       
    }
        
}
   
                
            }
        
           }
       {)
           
       }
        
    }
}
