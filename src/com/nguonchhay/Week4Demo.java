package com.nguonchhay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Week4Demo {

    public static void printArrayList(ArrayList<Integer> arr) {
        arr.forEach(item -> {
            System.out.print(item + "  ");
        });
    }

    public static void task1() {
        ArrayList<Integer> originalArray = new ArrayList<>();
        originalArray.add(1);
        originalArray.add(3);
        originalArray.add(7);
//        for (int i = 0; i < originalArray.size(); i++) {
//            System.out.print(originalArray.get(i) + "  ");
//        }
//        originalArray.forEach(item -> {
//            System.out.print(item + "  ");
//        });
        System.out.println("Original array: ");
        printArrayList(originalArray);

//        ArrayList<Integer> cloneArray = originalArray;
//        cloneArray.set(1, 5);

        ArrayList<Integer> cloneArray = new ArrayList<>();
        cloneArray.addAll(originalArray);

        cloneArray.set(1, 5);
        System.out.println("\n Clone array: ");
        printArrayList(cloneArray);

        System.out.println("\nOriginal array after clone update: ");
        printArrayList(originalArray);
    }

    public static void task2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(3);

        System.out.println("Before remove:");
        printArrayList(numbers);
        int removeNumber = 3;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == removeNumber) {
                numbers.remove(i);
            }
        }

        System.out.println("\nAfter remove: " + removeNumber);
        printArrayList(numbers);
    }

    public static void task3() {
        LinkedList<String> names = new LinkedList<>();
        names.add("Sok");
        names.add("San");
        names.add("Mey");
        names.add("Hong");
        System.out.println("Names by order:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nNames by reverse order:");
        Iterator<String> reverseIterator = names.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next() + " ");
        }
    }
}
