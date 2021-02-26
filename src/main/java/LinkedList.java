class LinkedList {
    Node head, tail;
    int size;

    public void append(int data) {
        Node node = new Node(data);

        //CHECK IF LIST IS EMPTY
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    //TO ADD NEW NODE IN MIDDLE
    public void addInMid(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp, current;
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            temp = head;
            current = null;
            for (int i = 0; i < count; i++) {
                current = temp;
                temp = temp.next;
            }
            current.next = newNode;
            newNode.next = temp;
        }
        size++;
    }

    //TO DELETE FIRST ELEMENT IN THE LIST
    public void deleteFirstElement() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }
    }
    //TO DISPLAY ELEMENTS
    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println("Data : " + n.data);
            n = n.next;
        }
        System.out.println("Data : " + n.data);
    }


}