import java.util.Arrays;
import java.util.Random;

public class Test15 {
    public static void main(String[] args){
        int n = 6000;
        Random random = new Random();
        int []v = {0,0,0,0,0,0};

        for(int i = 0; i< n; i++){
            int v1 = random.nextInt(6);
            v[v1]++;
        }
        System.out.println(Arrays.toString(v));
    }
}
