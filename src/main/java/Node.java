class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }

    public static void main(String[] args) {
        LinkedList add = new LinkedList();
        add.append(56);
        add.append(70);
        add.addInMid(30);
        add.deleteFirstElement();
        add.show();
    }
}