package Solving_3;

public class Test11 {
    public static void main(String[] args){
        SimpleList list=new SimpleList();
        for (int i=0; i <5; i++) list.addFirst(i);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
