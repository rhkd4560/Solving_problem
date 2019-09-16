import java.util.Arrays;
import java.util.Random;

public class Test27 {
    public static void main(String[] args){
        int N = 9;
        int []num = new int[N];
        int []arr = new int[N];
        Random random = new Random();

        for (int i = 0; i < num.length; i++){
            num[i] = random.nextInt(10);
        }
        Arrays.sort(num);
        for(int i = 0; i < num.length/2; i++) {
            int temp = num[i];
            num[i]= num[num.length-i-1];
            num[num.length-i-1] = temp;
        }
        for(int i = 1; i < num.length; i++){
            arr[0] = 1;
            if(num[i-1] == num[i]){
                arr[i] = arr[i-1];
            } else {
                arr[i] = arr[i-1] + 1;
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(arr));
    }
}
