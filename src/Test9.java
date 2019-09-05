import java.util.Random;

public class Test9 {
    public static void main(String[] args){
        Random random = new Random();
        int n = 20;
        for (int i = 0; i < n; i++){
            int v = random.nextInt(6);
            System.out.print(v+1 + " ");
        }
    }
}
