package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap();

        Scanner scanner = new Scanner(System.in);

        System.out.println("MinHeap or MaxHeap? 1.MinHeap 2.MaxHeap");
        int choice = scanner.nextInt();

        if (choice == 1)
            heap = new Heap(new MinHeap());
        else if (choice == 2)
            heap = new Heap(new MaxHeap());
        else
            System.out.println("Invalid option");

        heap.add(1);
        heap.add(12);
        heap.add(3);
        heap.add(17);
        heap.add(8);
        heap.add(-1);

        System.out.println("Iterating through heap values in InOrder");
        Iterator<Node> iterator = heap.getIterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
        }

        System.out.print("Iterator from OddFilter:");

        iterator = heap.getIterator();
        OddFilter oddFilter = new OddFilter(iterator);
        while (oddFilter.hasNext()) {
            int num = oddFilter.next();
            System.out.print(num);
            System.out.print(" ");
        }

        OddHeapDecorator decoratedHeap = new OddHeapDecorator(heap);

        System.out.println("\n\nDecorated Array List:");
        Object[] objects = decoratedHeap.toArray();
        for (Object object : objects) System.out.println(object);

        System.out.println("Decorated String:");
        String str = decoratedHeap.toString();
        System.out.println(str);

        System.out.println("Decorated Iterator:");
        iterator=decoratedHeap.getIterator();
        while(iterator.hasNext())
        {
            int value=iterator.next();
            System.out.println(value);
        }

        System.out.println("Implementation of internal iterator");
        objects = heap.toArray();
        Integer[] intArray = Arrays.asList(objects).toArray(new Integer[0]);
        ArrayList<Integer> array_list = new ArrayList<Integer>(Arrays.asList(intArray));
        array_list.forEach(System.out::println);
    }

    //heap.forEach(System.out::println)

}
