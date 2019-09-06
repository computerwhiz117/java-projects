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
        Scanner shapes = new Scanner (System.in);
        System.out.println("Select the type of shape you want");
        String type = shapes.nextLine();
        System.out.println("Select the number of rows");
        int rows = shapes.nextByte();
        System.out.println("Select the number of columns");
        int columns = shapes.nextByte();
        System.out.println("Select the number of any requirements");
        int requirements = shapes.nextByte();
        
        
        if (type == "Circle")
        {
            System.out.println("You are printing a circle");
            System.out.println("Rows: " + rows);
            System.out.println("Columns: " + columns);
            System.out.println("Requirements :" + requirements);
        }
        else if (type == "X")
        {
            System.out.println("You are printing an X");
            System.out.println("Rows: " + rows);
            System.out.println("Columns: " + columns);
            System.out.println("Requirements: " + requirements);
        }
        else if (type == "Box")
        {
            System.out.println("You are printing a box");
            System.out.println("Rows: " + rows);
            System.out.println("Columns: " + columns);
            System.out.println("Requirements: " + requirements);
        }
        else if (type == "Xbox")
        {
            System.out.println("You are printing a box with an X inside");
            System.out.println("Rows: " + rows);
            System.out.println("Columns: " + columns);
            System.out.println("Requirements: " + requirements);
            
        }
        else
        {
            System.out.println("You are printing an other shape");
            System.out.println("Rows : " + rows);
            System.out.println("Columns: " + columns);
            System.out.println("Requirements: " + requirements);
        }
    }
    
}
