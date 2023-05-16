package com.company.linkedlist;

public class Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(3);
        linkedList.addFirst(7);
        linkedList.addFirst(4);
        linkedList.addLast(8);
        linkedList.addLast(6);
        linkedList.addLast(2);
        linkedList.addMiddle(1, 3);
        linkedList.removeFirst();
        linkedList.removeLast();

        int value = 10;
        int index = linkedList.recurSearch(value);

        System.out.println("RECURSION: Found "+value+" at index: "+index);

        index = linkedList.itrSearch(value);

        System.out.println("ITERATIVE: Found "+value+" at index: "+index);

        System.out.println(linkedList);

        System.out.println("Removed, 2nd element "+linkedList.removeFromLast(2)+" from the end");

        System.out.println(linkedList);
        linkedList.reverse();
        System.out.println(linkedList);

        System.out.println("is plaindrome: "+linkedList.isPalindrome());
        System.out.println(linkedList);

        linkedList.addLast(3);
        linkedList.addLast(1);
        linkedList.addLast(6);

        System.out.println(linkedList);

        System.out.println("is plaindrome: "+linkedList.isPalindrome());
        linkedList.sort();
        System.out.println(linkedList);
    }
}
