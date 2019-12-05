package Solving_7;

import java.util.Arrays;

public class Test14 {
    public static void main(String[] args) {
        int v[]={87,95,53,77,100,95,14};
        sort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void sort(int[] v) {
        int c[] = new int[101];
        for(int i = 0; i < v.length; i++){
            c[v[i]]++;
        }
        for(int i = 0, k = 0; i < c.length; i++){
            if(c[i] == 1) v[k++] = i;
            else if(c[i] > 1){
                while (c[i] > 0){
                    v[k++] = i;
                    c[i]--;
                }
            }
        }
    }
}
