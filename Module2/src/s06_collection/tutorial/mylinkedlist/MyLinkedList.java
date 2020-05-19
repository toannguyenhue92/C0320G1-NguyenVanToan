package s06_collection.tutorial.mylinkedlist;

public class MyLinkedList {
    private Node head;
    private int size;

    public int getSize() {
        return size;
    }

    public MyLinkedList() {
    }

    public void add(int index, Object data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1 && currentNode.getNext() != null; i++) {
                currentNode = currentNode.getNext();
            }
            Node holder = currentNode.getNext();
            currentNode.setNext(new Node(data));
            currentNode.getNext().setNext(holder);

        }
        size++;
    }

    public void addFirst(Object data) {
        Node temporary = head;
        head = new Node(data);
        head.setNext(temporary);
        size++;
    }

    public Node get(int index) {
        Node temporary = head;
        for (int i = 0; i < index; i++) {
            temporary = temporary.getNext();
        }
        return temporary;
    }

    public void printList() {
        Node temporary = head;
        while (temporary != null) {
            System.out.println(temporary.getData());
            temporary = temporary.getNext();
        }
    }
}
