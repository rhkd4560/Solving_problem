package Solving_6;

public class Test8 {
    public static void main(String[] args){
        int n[] = {5,1,8,3,2};
        System.out.println(max(n, n.length-1));
    }
    public static int max(int[] n, int i){
        if(i == 0) return n[i];
        int v1 = n[i];
        int v2 = max(n, i-1);
        if(v1 >v2) return v1;
        else return v2;
    }
}
