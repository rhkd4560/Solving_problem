package Solving_6;

public class Test5 {
    public static void main(String[] args) {
        System.out.println(power(2,60));
    }
    private static long power(long m, long n) {
        if(n==0) return 1;
        return power(m*m,n/2)*(n%2==0? 1:m);
    }
}
