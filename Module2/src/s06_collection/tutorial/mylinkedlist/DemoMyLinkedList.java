package s06_collection.tutorial.mylinkedlist;

public class DemoMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0, 100);
        myLinkedList.add(1, 5.6);
        myLinkedList.add(2, true);
        myLinkedList.add(3, "Zebra");
        myLinkedList.addFirst("First");
        myLinkedList.addFirst("First-1");
        myLinkedList.addFirst("First-2");
        myLinkedList.get(0).setData("Edited!");
        myLinkedList.printList();
        System.out.println("List size : " + myLinkedList.getSize());
    }
}
