package org.example;

public class MyStack<T> {
    MyLinkedList<T> list;

    public void push(T e){
        list.add(e);
    }

    public T pop(){
        return list.getFirst();
    }
}
