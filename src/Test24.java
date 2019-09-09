import java.util.Arrays;
import java.util.Random;

public class Test24 {
    public static void main(String[] args){
        /*int N = 9;
        int []num = new int[N];*/
        int []num = {3,3,3,3,3,3,3,3};
        /*Random random = new Random();
        for(int i = 0; i < num.length; i++){
            num[i] = random.nextInt(10);
        }
        Arrays.sort(num);*/
        int max = num[num.length-1];
        int secondmax = 0;
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++){
            if(secondmax < num[i] && num[i] < max){
                secondmax = num[i];
            }
        }
        if(secondmax == 0){
            System.out.println("None");
        } else{
            System.out.println(secondmax);
        }
    }
}
