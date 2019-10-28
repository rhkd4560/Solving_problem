package Solving_5;

import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7,3));
    }
    private static int solveJosephusProblem(int n, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) queue.addLast(i);
        while (queue.size() > 1) {
            for(int i = 0; i < k-1; i++){
                int v = queue.removeFirst();
                queue.addLast(v);
            }
            queue.removeFirst();
        }
        return queue.removeFirst();
    }
}
