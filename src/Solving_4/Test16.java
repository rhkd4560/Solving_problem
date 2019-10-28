package Solving_4;

import java.util.Arrays;

public class Test16 {
    public static void main(String[] args) {
        int n[]={1,2,3,4};
        System.out.println(Arrays.toString(n));
        int m[]=arrayCopy(n, n.length*2);
        n=m;
        System.out.println(Arrays.toString(n));
        n=arrayCopy(n, (int) (n.length*0.25));
        System.out.println(Arrays.toString(n));
    }
    private static int[] arrayCopy(int[] n, int newSize) {
        int w[] = new int [newSize];
        if(n.length < newSize){
            for(int i = 0; i < n.length; i++){
                w[i] = n[i];
            }
        }
        else{
            for(int i = 0; i < w.length; i++){
                w[i] = n[i];
            }
        }
        n = w;
        return n;
    }
}
