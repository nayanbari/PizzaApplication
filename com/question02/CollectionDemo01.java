package com.question02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionDemo01 {

    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        System.out.println("First element in ArrayList: " + arrayList.get(0));

        // Vector
        Vector<String> vector = new Vector<>();
        vector.add("Dog");
        vector.add("Elephant");
        vector.add("Frog");
        System.out.println("Vector: " + vector);

        System.out.println("First element in Vector: " + vector.get(0));

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println("LinkedList: " + linkedList);

        // Retrieve elements from LinkedList
        System.out.println("First element in LinkedList: " + linkedList.get(0));

        String[] fruits = {"Jackfruit", "Kiwi", "Lemon"};
        List<String> fruitList = arrayToList(fruits);
        System.out.println("Array to List: " + fruitList);
    }
}
