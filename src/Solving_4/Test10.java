package Solving_4;

import java.util.Stack;

public class Test10 {
    public static void main(String[] args) {
        String e="3 1 2 / *";
        System.out.println(postfixEval(e));
    }
    private static double postfixEval(String e) {

        Stack<Double> stack=new Stack<>();
        for (String token : e.split("\\s+")) {
            if("+-*/".contains(token)){
                double n2 = stack.pop();
                double n1 = stack.pop();
                if(token.equals("+")){
                    stack.push(n1+n2);
                }
                if(token.equals("-")){
                    stack.push(n1-n2);
                }
                if(token.equals("*")){
                    stack.push(n1*n2);
                }
                if(token.equals("/")){
                    stack.push(n1/n2);
                }
            } else {
                stack.push(Double.parseDouble(token));
            }
        }
        return stack.pop();
    }
}
