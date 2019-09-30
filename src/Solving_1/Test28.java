package Solving_1;

import java.util.Arrays;

public class Test28 {
    public static void main(String[] args){
        int []n = {1,2,3,4,5};
        int k = 2;
        k = k % n.length;
        reverse(n, 0, n.length-1);
        reverse(n, 0, k-1);
        reverse(n, k, n.length-1);
        System.out.println(Arrays.toString(n));
    }

    private static void reverse(int[] n, int s, int e) {
        while (s<e){
            int temp = n[s];
            n[s] = n[e];
            n[e] = temp;
            s++;
            e--;
        }
    }

}
