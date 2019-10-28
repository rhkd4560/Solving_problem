package Solving_4;

import java.util.Arrays;

public class Test19 {
    public static void main(String[] args){
        int price[]= {100,90,80,70,85,95,110,120};
        int span[]=new int[price.length];
        span[0] = 1;
        for(int i = 1; i < price.length; i++){
            if(price[i-1] > price[i]){
                span[i] = 1;
            } else{
                int count = 1;
                for(int j = i-1 ; j >=0; j--){
                    if(price[j] < price[i]){
                        count++;
                    }
                }
                span[i] = count;
            }
        }

        System.out.println(Arrays.toString(span));
    }
}
