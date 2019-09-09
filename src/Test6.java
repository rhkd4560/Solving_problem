public class Test6 {
    public static void main(String[] args){
        int n = 987654321;
        int k = 4;


        for (int i = 1; i < k; i++){
            n = n / 10;
        }
        System.out.println(n%10);
    }
}
