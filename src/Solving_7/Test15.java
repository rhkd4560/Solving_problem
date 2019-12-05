package Solving_7;

import java.util.Arrays;

public class Test15 {
    public static void main(String[] args) {
        int v[]={1,-5,3,2,1,4,-3,-1,-1,0};
        sort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void sort(int[] v) {
        int min  = v[0], max = 0;
        for(int i = 0; i < v.length; i++){
            if(min > v[i]) min = v[i];
            if(max < v[i]) max = v[i];
        }
        int c[] = new int[max - min +1];
        for(int i = 0; i < v.length; i++){
            c[v[i] - min]++;
        }
        for(int i = 0, k = 0; i < c.length; i++){
            while (c[i]-- > 0){
                v[k++] = i + min;
            }
        }
    }
}
