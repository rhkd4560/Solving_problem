package report;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args){
        long v[] = {34,76,11,3,7,13,9};;
        long min = v[0];
        for(int i = 0; i < v.length; i++){
            for(int j = i+1; j < v.length; j++){
               long dis = Math.abs(v[i]-v[j]);
                if(min > dis){
                    min = dis;
                }
            }
        }

        System.out.println(min);
    }
}
