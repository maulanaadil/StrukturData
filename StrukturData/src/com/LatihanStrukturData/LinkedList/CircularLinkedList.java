package com.LatihanStrukturData.LinkedList;

public class CircularLinkedList implements ILinkList {

    class Node {
        Object data;
        Node next, prev;

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size = 0;
    Node head, tail;

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void addFirst(Object newData) {
        Node newest = new Node(newData, null);
        if (isEmpty()) {
            head = newest;
            tail = newest;
            tail.next = head;
        } else {
            tail.next = newest;
            newest.next = head;
            head = newest;
        }
        size++;
    }

    @Override
    public void addLast(Object newData) {
        if (isEmpty()) {
            addFirst(newData);
        } else {
            Node newest = new Node(newData, null);
            tail.next = newest;
            tail = newest;
            size++;
        }
    }

    @Override
    public Object removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            Object removed = head.data;
            tail.next = head.next;
            head = head.next;
            size--;
            return removed;
        }
    }

    @Override
    public Object removeLast() {
        int count = 0;
        Node pointer = head;
        Object removed = tail.data;

        while (pointer != null) {
            if (count == size() - 2) {
                tail = pointer;
                tail.next = head;
                break;
            }
            count++;
            pointer = pointer.next;
        }
        size--;
        return removed;
    }

    @Override
    public void print() {
        Node pointer = head;

        for (int i = 0; i < size; i++){
            System.out.printf("%s-> ", pointer.data);
            pointer = pointer.next;
        }
        System.out.println();
    }

    @Override
    public int size() {
        return size;
    }

    public void rotate() {
        if (!isEmpty()) {
            head = head.next;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst(12);
        cll.addFirst(45);
        cll.addLast(69);
        cll.print();
        System.out.println("Data yg diremove : " + cll.removeFirst());
        cll.print();
        System.out.println("Data yg di remove : "+ cll.removeLast());
        cll.addLast(40);
        cll.addFirst(30);
        System.out.println("Sebelum dirotate");
        cll.print();
        System.out.println("Setelah dirotate");
        cll.rotate();
        cll.print();
    }
}