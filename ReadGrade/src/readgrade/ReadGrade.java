/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readgrade;

/**
 *
 * @author carli
 */
public class ReadGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestGrade myObject = new TestGrade(100);
        System.out.println(myObject.getScore());
        myObject.SetScore(200);
        System.out.println(myObject.getScore());
    }
    
}
