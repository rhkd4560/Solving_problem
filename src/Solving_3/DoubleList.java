package Solving_3;

public class DoubleList {
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
        if(head==null){
            addFirst(data);
        } else{
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void removeFirst(){
        if(head!= null){
            Node removeNode = head;
            head = null;
            head = removeNode.next;
            head.prev = null;
        }
    }
    public void removeLast(){
        if(head != null){
            Node removeNode = tail;
            tail = null;
            tail = removeNode.prev;
            tail.next = null;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("head");
        for (Node p = head; p != null; p = p.next) {
            sb.append("->").append(p.data);
        }

        sb.append("\n").append("tail");

        for(Node p = tail; p!= null; p = p.prev){
            sb.append("->").append(p.data);
        }

        return sb.toString();
    }
}
