package com.LatihanStrukturData.LinkedList;

public interface ILinkList {
    boolean isEmpty();
    void addFirst(Object newData);
    void addLast(Object newData);
    Object removeFirst();
    Object removeLast();
    void print();
    int size();
}
