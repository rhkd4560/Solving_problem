package Solving_6;

public class Test11 {
    public static void main(String[] args){
        String s="South, Korea";
        char v[]=s.toCharArray();
        System.out.println(countUpper(v, 0));
    }
    private static int countUpper(char[] v, int i) {
        int count = 0;
        if('A' <= v[i] && v[i] <= 'Z') count++;
        if(i == v.length-1) return count;
        return count + countUpper(v, i+1);
    }
}
