package Solving_7;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args){
        int v[]=new int[]{5,8,1,9,3,5,1,5};
        bubbleSort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 1; j < v.length-i; j++) {
                if(v[j-1]>v[j]) { // 인접 자료 간 순서 맞지 않으면 교환
                    int temp=v[j];
                    v[j]=v[j-1];
                    v[j-1]=temp;
                }
            }
        }
    }
}
