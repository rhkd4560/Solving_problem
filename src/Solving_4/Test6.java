package Solving_4;

import java.util.Stack;

public class Test6 {
    public static void main(String[] args) {
        String s="부산({Busan}[(Boo)(saan)])시청({City}{hall}[(See)(Cheong)])"; // true
        System.out.println(checkParen(s));
    }
    private static boolean checkParen(String s) {
        Stack<Character> stack=new Stack<>();
        for (Character c : s.toCharArray()){
            if(c == '(' || c =='{' || c =='['){
                stack.push(c);
            }
            if(c == ')'){
                if(stack.isEmpty()) return false;
                else {
                    if(stack.peek() == '(') stack.pop();
                    else return false;
                }
            }
            if(c =='}'){
                if(stack.isEmpty()) return false;
                else{
                    if(stack.peek() == '{') stack.pop();
                    else return false;
                }
            }
            if(c ==']'){
                if(stack.isEmpty()) return false;
                else{
                    if(stack.peek() == '[') stack.pop();
                    else return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
