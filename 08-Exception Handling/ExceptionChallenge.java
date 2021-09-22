import java.lang.*;
import java.util.*;

class StackOverflowException extends Exception {
    public String toString() {
        return "Stack is full!!!";
    }
}

class StackUnderException extends Exception {
    public String toString() {
        return "Stack is empty!!!";
    }
}

class Stack{
    private int size;
    private int top =-1;
    private int s[];

    public Stack(int size){
        this.size = size;
        s= new int[size];
    }

    void push(int n) throws StackOverflowException{
        if (top==size-1)
            throw new StackOverflowException();
        s[++top]=n;
    }

    int pop() throws StackUnderException{
        if(top==-1)
            throw new StackUnderException();
        return s[top--];
    }
    void display(){
        for(int x:s){
            System.out.println(x);
        }
    }
}

class ExceptionChallenge {
    public static void main(String[] args){
        Stack s1 = new Stack(5);

        try{
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println("12345 is filled");
        s1.push(6);
        }
        catch(StackOverflowException e){
            System.out.println(e.toString());
        }
        try{
            System.out.println("Poped element is: "+s1.pop());
        }
        catch(StackUnderException e){
            System.out.println(e.toString());
        }
    }
}
