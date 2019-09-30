package Solving_3;

public class SimpleList {
    Node head, tail;
    int size = 0;
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addLast(int data){
        // tail 사용
        /*if(head==null){
            addFirst(data);
        } else{
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }*/
        if(head == null){
            addFirst(data);
        } else{
            Node newnode = new Node(data);
            Node p = head;
            while (p.next != null) p = p.next;
            p.next = newnode;
        }
        size++;
    }
    public void removeFirst(){
        Node p = head;
        head = head.next;
        p.next = null;
    }
    public void removeLast(){
        Node p = head;
        Node prev = null;
        while (p.next != null) {
            prev = p;
            p = p.next;
        }
        if(prev != null) prev.next = null;
        else head = null;
    }
    public int size(){
        return size;
    }
    public int get(int i){
        if(i < 0 || i > size) throw new RuntimeException("범위 오류");
        Node p = head;
        while (i-- > 0){
            p = p.next;
        }
        return p.data;
    }
    @Override
    public String toString() {
        String v = "";
        for (Node p = head; p!=null; p=p.next){
            if(v.length()>0) v+="->";
            v+=p.data;
        }
        return v;
    }
}
