package report;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args){
        long v[]={34,76,11,3,7,13,9};
        Arrays.sort(v);
        long min = v[0];
        for(int i = 1; i < v.length; i++){
            long dis = Math.abs(v[i-1] - v[i]);
            if(min > dis){
                min = dis;
            }
        }

        System.out.println(min);

    }
}
