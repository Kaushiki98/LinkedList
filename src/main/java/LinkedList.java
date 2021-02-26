public class LinkedList {
    Node head,tail;
    int size;

    public void append(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println("Data : " + n.data);
            n = n.next;
        }
        System.out.println("Data : " + n.data);
    }
}