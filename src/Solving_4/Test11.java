package Solving_4;

import Solving_3.DoubleList;

import java.util.Stack;

public class Test11 {
    public static void main(String[] args) {
        String e="34 12 25/*";
        System.out.println(postfixEval(e));
    }
    private static double postfixEval(String e) {
        Stack<Double> stack=new Stack<>();
        e = e.replace("/", " /");
        e = e.replace("+", " +");
        e = e.replace("*", " *");
        e = e.replace("-", " -");
        for(String token : e.split("\\s+")){
            if("+-*/".contains(token)){
                double n2 = stack.pop();
                double n1 = stack.pop();
                if(token.equals("+")) stack.push(n1+n2);
                if(token.equals("-")) stack.push(n1-n2);
                if(token.equals("*")) stack.push(n1*n2);
                if(token.equals("/")) stack.push(n1/n2);
            } else{
                stack.push(Double.parseDouble(token));
            }
        }
        return stack.pop();
    }
}