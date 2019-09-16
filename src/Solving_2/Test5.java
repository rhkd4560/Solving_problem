package Solving_2;

import java.util.LinkedList;
import java.util.Random;

public class Test5 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list.get(99999));
    }
}
