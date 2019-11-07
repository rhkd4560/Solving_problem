package Solving_6;

public class Test4 {
    public static void main(String[] args) {
        int m = 2, n = 60;
        System.out.println(power(m, n));
    }

    private static long power(long m, long n) {
        if (n == 0) return 1;
        return m * power(m, n - 1);
    }
}
