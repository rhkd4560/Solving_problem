package Solving_4;

import java.util.Arrays;

public class SimpleStack {
    int stack[];
    int top=-1;
    public SimpleStack(int size) {
        stack=new int[size];
    }
    public void push(int data) {
        stack[++top]=data;
    }
    public int pop() {
        return stack[top--];
    }

    public boolean isEmpty()   {
        if(top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull()    {
        if(top == stack.length - 1)
            return true;
        else
            return false;
    }

    public int peek()  {
        return stack[top];
    }
    @Override
    public String toString() {
        return "top="+top+", stack="+Arrays.toString(stack);
    }
}
