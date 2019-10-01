/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check for prime number: ");
        int userValue = input.nextInt();
        System.out.println(showPrime(userValue));
        
        String response;
        for(int i = 2; i < userValue; i++)
        {
            if(userValue % i == 0)
                Response = "Not Prime";
            System.exit(0);
        }
        System.out.println("Prime");
    }
    
}
