package Solving_6;

public class Test18 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    private static long fibo(int n) {
        long memo[] = new long[n+1];
        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2; i <= n; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
}
