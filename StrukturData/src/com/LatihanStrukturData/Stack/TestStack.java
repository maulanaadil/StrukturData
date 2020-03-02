package com.LatihanStrukturData.Stack;

public class TestStack {
    public static void main(String[] args){
        Stack stack = new Stack(10);

        System.out.println("Data Awal");
        stack.push(20);
        stack.push(10);
        stack.push(56);
        stack.print();
        System.out.println();
        stack.pop();
        System.out.println("Setelah pop data");
        stack.print();
        System.out.println();
        stack.push(99);
        System.out.println("Setelah push data");
        stack.print();
    }
}
