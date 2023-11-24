package org.example;

public class MyQueue<T> {
    MyLinkedList<T> list;

    public void offer(T e) {
        list.addLast(e);
    }

    public T peek() {
        return list.getFirst();
    }

    public T poll() {
        return list.removeFirst();
    }
}
