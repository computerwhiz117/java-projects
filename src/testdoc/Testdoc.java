/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdoc;
import java.util.Scanner;


/**
 *
 * @author carli
 */
public class Testdoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
      Scanner keyboard = new Scanner(System.in);
       //System.out.println("What is your name: ");
       //String myName = keyboard.nextLine();
      // System.out.println("What is your age");
       //short age = keyboard.nextShort();
       
      // System.out.println("Your name is: " + myName + "\n");
       //System.out.println("You are: " + age + " old");
       int age = 100;
       
       if (age >= 90)
       {
           System.out.println("You are 90+ years old");
       }
       else if (age >= 80)
       {
           System.out.println("You are 80+ years old");
       }
       else
       {
           System.out.println("You are 70+ or earlier years old");
       }
    }
    
}
