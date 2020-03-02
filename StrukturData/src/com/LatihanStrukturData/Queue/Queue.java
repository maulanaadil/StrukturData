package com.LatihanStrukturData.Queue;
import com.LatihanStrukturData.LinkedList.SingleLinkedList;

public class Queue {
    private SingleLinkedList list;

    public Queue(){
        list = new SingleLinkedList();
    }

    public void enqueue(Object data){
        list.addLast(data);
    }

    public Object dequeue(){
        return list.removeFirst();
    }

    public int size(){
        return list.size();
    }

    public void print(){
        list.print();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(20);
        q.enqueue(50);
        q.enqueue(70);
        q.print();
        q.dequeue();
        q.print();
        q.enqueue(23);
        q.print();
    }
}
