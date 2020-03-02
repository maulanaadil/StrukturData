package com.LatihanStrukturData.LinkedList;
public class DoubleLinkedList implements ILinkList{

    class Node {
        Object data;
        Node next;
        Node prev;

        Node(Object data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head, tail;
    private int size = 0;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(Object newData) {
        if (isEmpty()){
            Node newest = new Node(newData, null, null);
            head = newest;
            tail = newest;
        } else {
           Node newest = new Node(newData, head, null);
           head.prev = newest;
           head = newest;
        }
        size++;
    }

    @Override
    public void addLast(Object newData) {
        if (isEmpty()){
            addFirst(newData);
        } else {
            Node newest = new Node(newData, null, tail);
            tail.next = newest;
            tail = newest;
            size++;
        }
    }

    @Override
    public Object removeFirst() {
        if (isEmpty()){
            return null;
        } else {
            Object removed = head.data;
            head = head.next;
            head.prev = null;

            size--;
            return removed;
        }
    }

    @Override
    public Object removeLast() {
        if (isEmpty()){
            return null;
        } else {
            Object removed = tail.data;
            tail = tail.prev;
            tail.next = null;

            size--;
            return removed;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        Node pointer = head;

        while ( pointer != null) {
            System.out.printf("%s-> ", pointer.data);
            pointer = pointer.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(91);
        dll.addFirst(77);
        dll.addLast(67);
        dll.print();
        System.out.println("Data yg sudah di removedFirst : " + dll.removeFirst());
        dll.print();
        System.out.println("Data yg sudah di removedLast : " + dll.removeLast());
        dll.print();

    }
}
