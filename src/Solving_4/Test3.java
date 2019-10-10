package Solving_4;

import java.util.Stack;
public class Test3 {
    public static void main(String[] args) {
        String s = "대한민국의 수도는 서울이다.";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.push(c);
        }
        for(int i = 0 ; i < s.length();i ++){
            System.out.print(stack.pop());
        }

    }
}
