package Solving_7;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int v[]=new int[]{8,5,9,1,5,3,5,1};
        mergeSort(v, 0, v.length-1);
        System.out.println(Arrays.toString(v));
    }
    private static void mergeSort(int[] v, int left, int right) {
        if(left==right) return;
        int m=(left+right)/2;
        mergeSort(v, left, m);
        mergeSort(v, m+1, right);
        mergeArray(v, left, m, m+1, right);
    }
    private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
        int w[] = new int[right2-left1+1];
        int i = left1, j = left2, k = 0;
        while (i <= right1 && j <= right2){
            w[k++] = (v[i] < v[j]) ? v[i++] : v[j++];
        }
        while (i <= right1) w[k++] = v[i++];
        while (j <= right2) w[k++] = v[j++];
        for(i = left1, k = 0; k < w.length;){
            v[i++] = w[k++];
        }
    }
}
