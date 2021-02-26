class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }

    public static void main(String[] args) {
        LinkedList add = new LinkedList();
        add.append(70);
        add.append(30);
        add.append(56);
        add.show();
    }
}