package Solving_4;

import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args){
        String s="대한민국의 수도는 서울이다.";
        LinkedList<Character> stack=new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            stack.addLast(c);
        }
        for(int i = 0; i < s.length(); i++){
            System.out.print(stack.removeLast());
        }
    }
}
