package org.example;

import java.util.Arrays;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 10);
        list.add(3, 10);
        list.displayLinkedList();
        list.remove(2);
        list.remove(0);
        list.displayLinkedList();
        list.set(0, 777);
        list.displayLinkedList();


    }
}