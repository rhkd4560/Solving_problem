package Solving_1;

import java.util.Arrays;
import java.util.Random;

public class Test26 {
    public static void main(String[] args){
        int N = 9;
        int []num = new int[N];
        Random random = new Random();
        for(int i = 0; i< num.length; i++){
            num[i] = random.nextInt(10);
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        for(int i = 1; i < num.length; i++){
            if(num[i-1] == num[i]){
                num[i-1] = -1;
            }
        }
        for(int i = 0 ; i< num.length; i++){
            if(num[i] != -1){
                System.out.print(num[i] + " ");
            }
        }
    }
}
