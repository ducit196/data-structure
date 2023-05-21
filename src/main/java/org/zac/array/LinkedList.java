package org.zac.array;

public class LinkedList {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    public void addFront(int data) {

        Node newNode = new Node(data);

        if(this.head == null) {
            this.head = newNode;
            return;
        }

        //Set's its next to current node
        newNode.next = this.head;
        this.head = newNode;
    }

    public int getHead() {
        return this.head.data;
    }

    public int getLast() {
        if (head == null) {
            throw new IllegalStateException("Empty list");
        }
        Node current = head;
        while (current.next != null) {
            current=  current.next;
        }
        return current.data;
    }

    public void addBack(int value) {

        Node newNode = new Node(value);

        if(this.head == null) {
            this.head = newNode;
            return;
        }

        //Jump to the last
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public int size() {
        int size = 0;
        if(this.head == null) {
            return size;
        }
        Node current = this.head;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public void clear() {
        this.head = null;
    }

    public void delete(int value) {
        if(this.head.data == value) {
            this.head = head.next;
            return;
        }
        Node current = this.head;
        while (current.next.data != value) {
            current = current.next;
        }
        current.next = current.next.next;



    }

}
