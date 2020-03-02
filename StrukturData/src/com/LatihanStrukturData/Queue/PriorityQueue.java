package com.LatihanStrukturData.Queue;
import com.LatihanStrukturData.LinkedList.SingleLinkedList;

public class PriorityQueue {

    class Node {
        int priority;
        Object data;
        Node next, prev;

        Node(int priority, Object data, Node next, Node prev) {
            this.priority = priority;
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public String toString() {
            return String.format("{priority = %d, data = %s}", priority, data);
        }
    }
        private Node head, tail;
        private int size = 0;

        public boolean isEmpty(){
            return size == 0;
        }

        public void enqueue(int priority, Object data){
            if (isEmpty()){
                Node newest = new Node(priority, data, null, null);
                head = tail = newest;
            } else {
                Node newest = new Node(priority, data,null,null);

                if(newest.priority > head.priority){
                    newest.prev = null;
                    newest.next = head;
                    head.prev   = newest;
                    head        = newest;
                } else if (newest.priority < tail.priority){
                    newest.next = null;
                    newest.prev = tail;
                    tail.next = newest;
                    tail = newest;
                } else {
                    Node pointer = tail;
                    while(pointer != null ){
                        if (pointer.priority == newest.priority){
                            if (pointer == tail){
                                newest.next = null;
                                newest.prev = tail;
                                tail.next = newest;
                                tail = newest;
                            } else {
                                newest.next = pointer.next;
                                pointer.next.prev = newest;
                                newest.prev = pointer;
                                pointer.next = newest;
                            }
                            break;
                        }
                        pointer = pointer.prev;
                    }
                }
            }
            size++;
        }

        public void print(){
            Node p = head;
            while(p != null){
                System.out.println(p);
                p = p.next;
            }
        }

    public static void main(String[] args) {
            PriorityQueue pq = new PriorityQueue();
            pq.enqueue(1,"A");
            pq.enqueue(2,"C");
            pq.enqueue(1,"Y");
            pq.enqueue(-1,"SS");
            pq.enqueue(1,"lala");
            pq.enqueue(2,"Jojo");
            pq.enqueue(1,"Zaky");
            pq.print();
    }
}
