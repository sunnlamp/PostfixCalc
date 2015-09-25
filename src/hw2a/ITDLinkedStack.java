/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2a;
import java.util.Scanner;
/**
 *
 * @author RogelioZamudio
 */
public class ITDLinkedStack {
    public static void main(String[] args) {
        LinkedStack stack;
        stack = new LinkedStack();
        
        int choice;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("Please select an option.");
        System.out.println("1: Display Menu");
        System.out.println("2: Check if the Stack is Empty");
        System.out.println("3. Push the Stack");
        System.out.println("4: Display Top of Stack");
        System.out.println("5: Pop the Stack");
        System.out.println("6: Empty the Stack");
        System.out.println("7: Get size of Stack");
        System.out.println("8: Show contents of Stack ");
        System.out.println("0: Exit Program");
        
        choice = s.nextInt();
        
        while(choice != 0) {
            
            
            
            if(choice == 1) {
                System.out.println("Menu");
                System.out.println("Please select an option.");
                System.out.println("1: Display Menu");
                System.out.println("2: Check if the Stack is Empty");
                System.out.println("3. Push the Stack");
                System.out.println("4: Display Top of Stack");
                System.out.println("5: Pop the Stack");
                System.out.println("6: Empty the Stack");
                System.out.println("7: Get size of Stack");
                System.out.println("8: Show contents of Stack ");
                System.out.println("0: Exit Program");
            }
            
            else if(choice == 2) {
                if(!stack.isEmpty()) {
                    System.out.println("Stack is not empty.");
                }
                else
                    System.out.println("Stack is empty.");
            }
            
            else if(choice == 3) {
                System.out.println("Enter data to be pushed onto stack: ");
                int push = s.nextInt();
                System.out.println("You have entered: " + push);
                stack.push(push);
            }
            
            else if(choice == 4) {
                if(!stack.isEmpty()) {
                    System.out.println("The element at stop of stack is: ");
                    System.out.print(stack.top());
                }
                else {
                    System.out.println("Stack is empty.");
                }
            }
            
            else if(choice == 5) {
                System.out.println("Popped " + stack.top() + " off the stack.");
                stack.pop();
            }
            
            else if(choice == 6) {
                if(stack.isEmpty() == true) {
                    System.out.println("The stack is already empty.");
                }
                
                if(!stack.isEmpty()) {
                    System.out.println("The stack will be emptied.");
                    while(!stack.isEmpty()) {
                        System.out.println(stack.top() + " has been popped off stack.");
                        stack.pop();
                    }
                } 
            }
            
            else if(choice == 7) {
                System.out.println("The size of the stack is " + stack.size());
            }
            
            else if(choice == 8) {
                System.out.println("Here are the contents of the stack: ");
                System.out.println(stack.toString());
                
            }
            
            System.out.println("");
            System.out.println("Please enter your next choice: ");
            
            
            choice = s.nextInt();
        }
        
        System.out.println("Goodbye.");
        
        
        
    }
}