package Solving_3;

public class Test8 {
    public static void main(String[] args){
        Node head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        printList(head);

        int searchValue = 2;

        Node p = head, prev = null;
        while (p!=null && p.data!=searchValue){
            prev = p;
            p = p.next;
        }
        if(p == null) System.out.println(searchValue + "존재하지 않음");
        else {
            if(prev != null) prev.next = p.next;
            else head = p.next;
            p.next = null;
        }
        printList(head);
    }

    private static void printList(Node head) {
        String v = "";
        for (Node p = head; p!=null; p=p.next){
            if(v.length()>0) v+="->";
            v+=p.data;
        }
        System.out.println(v);
    }
}
