package Solving_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int v[] = {4,1,1,4,4};
        int c[] = new int[5];

        Arrays.sort(v);
        for(int i = 0; i < v.length; i++){
            c[v[i]]++;
        }

        for(int i = 0; i < c.length; i++){
            if(c[i]>0) System.out.print(i);
        }
    }
}
