package Solving_6;

public class Test7 {
    public static void main(String[] args){
        int n[] = {1,2,3,4,5};
        System.out.println(sum(n,0));
    }

    private static int sum(int[] n, int i) {
        if(i == n.length-1) return n[n.length-1];
        return n[i] + sum(n, i+1);
    }
}
