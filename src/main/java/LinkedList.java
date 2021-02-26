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

    //DELETE LAST ELEMENT IN THE LIST
    public void deleteLastElement() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail ) {
                Node current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }

    //TO SEARCH ELEMENT IN THE LIST
    public void search(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
            System.out.println("Element is present in the list ");
        else
            System.out.println("Element is not present in the list");
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