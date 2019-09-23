package Solving_3;

public class SimpleList {
    Node head, tail;
    int size = 0;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head != null){
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        if(head.next == null){
            tail = head;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head != null){
            Node p = head;
            while (p.next != null){
                p = p.next;
            }
            p.next = newNode;
        }
        else head = newNode;
        size++;
    }
    public void removeFirst(){
        head = head.next;
        size--;
    }
    public void removeLast(){
        if(head != null){
            Node p = head, prev = null;
            while (p.next != null){
                prev = p;
                p = p.next;
            }
            if(prev!= null) prev.next = null;
            else head = null;
        }
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
        StringBuilder v = new StringBuilder();
        for (Node p = head; p != null; p = p.next) {
            if (v.length() > 0)
                v.append("->");
            v.append(p.data);
        }
        return v.toString();
    }
}
