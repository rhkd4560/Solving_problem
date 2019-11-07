package Solving_6;

public class Test9 {
    public static void main(String [] args){
        int n[] = {5,1,8,3,2};
        System.out.println(max(n, 0, n.length-1));
    }

    private static long max(int[] n, int low, int high) {
        if (low == high) return n[high];
        int m = (low + high) / 2;
        long v1 = max(n, low, m);
        long v2 = max(n, m+1, high);
        return v1 > v2 ? v1 : v2;
    }
}
