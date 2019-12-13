/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Carlos
 */
public class Shapes {

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
                shapes.nextLine();
                filename = shapes.nextLine();
                System.out.println("Select the number of rows");
                rows = shapes.nextInt();
                System.out.println("Select the number of columns");
        columns = shapes.nextInt();
                ShapesMethod(rows, columns, filename); //Rename
                System.out.println("You are printing a box");
                break;
              
            case "Circle":
                System.out.print("Enter the filename");
                shapes.nextLine();
                filename = shapes.nextLine();
                //filename = shapes.nextLine();
                System.out.println("Select the number of radius");
                radius = shapes.nextInt();
                printPattern(radius, filename); //Rename
                System.out.println("You are printing a circle");
                break;
              
            case "X":
                System.out.print("Enter the filename");
                shapes.nextLine();
                filename = shapes.nextLine();
                System.out.println("Select the type of length");
                len = shapes.nextInt();
                pattern(len, filename); //Rename
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
    
    
    
    static void ShapesMethod(int rows, int columns, String fileName) {  //Box Rename 
        
        String shape = "";
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < columns; c++)
            {
                shape += "*";
                //System.out.print("*");
            }
            shape += "\n";
            //System.out.println();
      }
        file(shape, fileName);
    }
        
         //function to print circle pattern 
    static void printPattern(int radius, String fileName) { //Circle Rename
  
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
                shape += " ";
            
            
            } 
  
    //System.out.print("\n");
    shape += "\n";
    System.out.println();
    
     //take it out of the for loop
    
    }
       file(shape, fileName); //PUT IT HERE <<<------
}
    
    static void pattern(int len, String fileName) { //X Rename
        String shape = "";
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i==j) {
                    //System.out.print("#");
                    shape += "#";
                }
                else if (i +j==6){
                    //System.out.print("*");
                    shape += "*";
                }
                else{
                    //System.out.print(" ");
                    shape += " ";
                }
                //System.out.println();
                }
                shape += "\n";
                
            }
        file(shape, fileName);
        }
    static void file (String shapes, String filename) { //pass he shapes string
       try{ 
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));  //Set true for append mode 
            writer.newLine();   //Add new line
            writer.write(shapes);
            writer.close();
       }
       catch(Exception e)
       {
           System.out.println("File Not Opened");
       }
        
    }
}


        //for (int i = 0; i < len; i++)
        //{
            //int j = len - 1 - i;
            //for (int k = 0; k < len; k++)
            //{
                //if (k == i || k == j)
                    //System.out.print(str.charAt(k));
                //else
                    //System.out.print(" ");
            //}
            //System.out.println("");
        //}
    //}
    //public static void word(String[] args)
    //{
        //String str = "helloworld";
        //int len = str.length();
        //pattern(str, len);
    //}
    
//Function to print given  
 //string in cross pattern 
    //static void pattern(String str, 
                    //int len) 
    //{ 
      
    /* i and j are the indexes  
     of characters to be  
     displayed in the ith  
     iteration i = 0 initially  
     and go upto length of string 
     j = length of string initially  
     in each iteration of i,  
     we increment i and decrement j, 
     we print character only  
     of k==i or k==j */
    //for (int i = 0; i < len; i++) 
    //{ 
        //int j = len - 1 - i; 
        //for (int k = 0; k < len; k++) 
        //{ 
            //if (k == i || k == j) 
                //System.out.print(str.charAt(k)); 
            //else
                //System.out.print(" "); 
        //} 
        //System.out.println(""); 
    //} 
  //} 