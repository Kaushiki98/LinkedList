public class LinkedList {
    Node head;

    public void insert(int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;
        if (head == null) {
            head = n;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = n;
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