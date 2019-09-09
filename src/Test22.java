import java.util.Arrays;
import java.util.Random;

public class Test22 {
    public static void main(String[] args){
        int N = 9;
        int []num = new int[N];
        int max = 0;
        Random random = new Random();
        for(int i = 0; i< N; i++){
            num[i] = random.nextInt(10);
        }
        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(max);

    }
}
