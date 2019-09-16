package Solving_1;

import java.util.Random;

public class Test20 {
    public static void main(String[] args){
        int N = 20;
        int []num = new int[N];
        double sum = 0;
        Random random = new Random();
        for (int i = 0; i < num.length; i++){
            num[i] = random.nextInt(100);
            sum += num[i];
        }
        System.out.printf("%.2f", sum/num.length);

    }
}
