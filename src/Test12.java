
public class Test12 {
    public static void main(String[] args){
        int[] n = {77,88,99};
        String v = "";
        for(int i = 0; i < n.length; i++){
            v = v + n[i];
            if(i < n.length-1){
                v = v + ", ";
            }
        }
        System.out.println("[" + v + "]");
    }
}
