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
public class PostFixEvaluator {
    public static int evaluate(String expression) throws Exception {
        LinkedStack stack = new LinkedStack();
        
        int value;
        String operator;
        
        int operand1;
        int operand2;
        
        int result = 0;
        
        Scanner s = new Scanner(expression);
        
        while(s.hasNext()) {
            if(s.hasNextInt()) {
                //Process the operand
                value = s.nextInt();
                stack.push(value);
            }
            else {
                //Process operator
                operator = s.next();
                
                //Obtain second operand from stack
                if(stack.isEmpty())
                    throw new Exception("Not enough operands - stack " +
                                                            "underflow");
                operand2 = stack.top();
                stack.pop();
                
                if(stack.isEmpty())
                    throw new Exception("Not enough operands - stack " +
                                                             "underflow");
                
                operand1 = stack.top();
                    switch(operator) {
                        case "/":
                            result = operand1 / operand2;
                            break;
                        case "*":
                            result = operand1 * operand2;
                            break;
                        case "+":
                            result = operand1 + operand2;
                            break;
                        case "-":
                            result = operand1 - operand2;
                            break;
                        default:
                            throw new Exception("Illegal symbol: " + operator);
                            
                    }
                    
                    
                    stack.push(result);
                
            }
        }
        
        if(stack.isEmpty())
            throw new Exception("Not enough operands");
        result = stack.top();
        stack.pop();
        
        
        
        return result;
    }
    
}
