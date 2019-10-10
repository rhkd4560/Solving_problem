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

        }
        return stack.pop();
    }
}
