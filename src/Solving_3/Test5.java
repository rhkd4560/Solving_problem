package Solving_3;

public class Test5 {
    public static void main(String[] args) {
        Node head=null;
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        printList(head);

        int searchValue=3; // 1,2,9 등으로 변경하면서 실행해 볼 것.

        Node newNode=new Node(7);
        Node p=head, prev=null;
        while(p!=null && p.data!=searchValue){ prev=p; p=p.next; }
        if(p==null) System.out.println(searchValue+" does not exist");
        else{
            if(prev!=null) prev.next=newNode;
            else head=newNode;
            newNode.next=p;
        }
        printList(head);
    }
    private static void printList(Node head) {
        for (Node p=head; p != null; p=p.next) System.out.print(p.data+"->");
        System.out.println();
    }
}
