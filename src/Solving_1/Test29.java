package Solving_1;

import java.util.Arrays;
import java.util.Scanner;

public class Test29 {
    public static void main(String[] args){
        int N = 5;
        int []n = new int[N];
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        for (int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(n));
        while (K > 0) {
            int temp = n[n.length-1];
            for(int i = n.length-1; i > 0; i--){
                n[i] = n[i-1];
            }
            n[0] = temp;
            K--;
        }
        System.out.println(Arrays.toString(n));

    }
}
