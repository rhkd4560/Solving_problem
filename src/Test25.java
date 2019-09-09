import java.util.Arrays;
import java.util.Random;

public class Test25 {
    public static void main(String[] args){
        int N = 8;
        int []num = new int[N];
        Random random = new Random();
        for (int i = 0; i < num.length; i++){
            num[i] = random.nextInt(10);
        }
        Arrays.sort(num);
        if(num.length % 2 != 0){
            System.out.println(Arrays.toString(num));
            System.out.println(num[num.length/2]);
        } else{
            System.out.println(Arrays.toString(num));
            System.out.println((double)(num[num.length/2]+ num[(num.length/2)-1])/2);
        }
    }
}
