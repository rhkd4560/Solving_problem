package Solving_4;

public class Test13 {
    public static void main(String[] args) {
        String s="대한민국의 수도는 서울이다.";
        char stack[] = new char[s.length()];
        int top = -1;
        for(Character c : s.toCharArray()){
            stack[++top] = c;
        }
        for(int i = 0; i < s.length(); i++){
            System.out.print(stack[top--]);
        }
    }
}
