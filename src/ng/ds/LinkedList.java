package ng.ds;

public class LinkedList {

    Node head;

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.println("Linked list");
        while (currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static LinkedList deleteKey(LinkedList list, int key) {

        Node currNode = list.head, prev = null;

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println("Found the key ");
        }
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println("Node got deleted");
        }
        if (currNode == null) {
            System.out.println("Nod not found");
        }

        return list;
    }

    public static void main(String[] arg) {
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        printList(list);
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

}
