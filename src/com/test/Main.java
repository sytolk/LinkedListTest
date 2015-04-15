package com.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedListWithLoopDetector<Integer> minList = createList();
        LinkedListWithLoopDetector<Integer> loopList = createListWithLoop();

        if(minList.hasLoop()) System.out.println("loop Detected");
        else System.out.println("minList don`t have loop");

        if(loopList.hasLoop()) System.out.println("loopList - loop Detected");
        else System.out.println("loopList don`t have loop");
    }

    private static LinkedListWithLoopDetector<Integer> createListWithLoop(){
        LinkedListWithLoopDetector<Integer> list = createList();
        // Link the last element to the element 3 to create a loop
        list.getLast().setNext(list.get(4));
        return list;
    }

    private static LinkedListWithLoopDetector<Integer> createList(){
        LinkedListWithLoopDetector<Integer> list = new LinkedListWithLoopDetector<Integer>();
        for (int i = 5; i>=0 ;  i--) {
            list.add(i);
        }
        return list;
    }
}
