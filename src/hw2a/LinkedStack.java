package hw2a;

public class LinkedStack {
    private Node topOfStack;
   
    public boolean isEmpty() {
        if (topOfStack == null)
            return true;
        else
            return false;
    }
   
    public int top() {
        if (isEmpty())
            throw new RuntimeException("Top attempted on empty stack");
        else
            return topOfStack.data;
    }
   
    public void push(int m) {
        Node temp;
        temp = new Node();
        temp.data = m;
      
        temp.next = topOfStack;
        topOfStack = temp;
    }
   
    public int pop() {
        int value;
      
        if (isEmpty())
            throw new RuntimeException("Pop attempted on empty stack");
        else {
            value = topOfStack.data;
            topOfStack = topOfStack.next;
            return value;
        } 
    }
    
    public int size() {
        int size = 0;
        Node top = topOfStack;
        while(top != null) {
            
            top = top.next;
            size ++;
        }
        return size;
    }
    
    @Override
    public String toString() {
        Node top = topOfStack;            
        String result = "";
        while(top != null) {
            result += Integer.toString(top.data) + " ";
            top = top.next;
        }
            
        return result;
    }
    
    
}
