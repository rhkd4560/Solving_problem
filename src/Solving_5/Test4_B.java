package Solving_5;

import java.util.LinkedList;

public class Test4_B {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7, 3));
    }

    private static int solveJosephusProblem(int n, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.addLast(i);
        }
        int curPos = 0;
        while (queue.size() > 1){
            queue.remove((curPos+k-1)%n);
            curPos = (curPos+k-1)%n;
            System.out.println(queue);
            n--;
        }
        return queue.get(0);
    }
}
