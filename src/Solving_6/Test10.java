package Solving_6;

public class Test10 {
    public static void main(String[] args) {
        String s="South, Korea 안녕";
        char v[]=s.toCharArray();
        if(v[1] >= 'a' && v[1] <= 'z') v[1]-=32;
        toUpper(v, 0);
        System.out.println(v);
    }
    private static void toUpper(char[] v, int i) {
        if( 'a' <= v[i] && v[i] <= 'z') v[i] -= 32;
        if( i < v.length-1) toUpper(v, i+1);
    }
}
