/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2b;


import java.util.Scanner;
/**
 *
 * @author RogelioZamudio
 */
public class PostFixCalculator {
    
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        String fix1 = null;
        String fix2 = null;
        
        int result;
        
        do {
            //Ask user for the expression
            System.out.println("Enter a postfix expression to be evaluated: ");
            fix1 = s.nextLine();
            
            //Obtain and output result of the expression value
            try {
                result = PostFixEvaluator.evaluate(fix1);
                
                //Output
                System.out.println();
                System.out.println("Result = " + result);
            }
            catch (Exception e) {
                System.out.println();
                System.out.println("Error in expression - " + e.getMessage());
            }
            
            //Check for additional expression
            System.out.println();
            System.out.print("Evaluate another expression? (Y = Yes): ");
            fix2 = s.nextLine();
        }
        while (fix2.equalsIgnoreCase("y"));
        
        System.out.println("Program completed.");
    }
}
