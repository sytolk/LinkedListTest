package com.test;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: stanimir
 * Date: 4/15/15
 * Time: 18:36 PM
 * developer STANIMIR MARINOV
 */
public class LinkedListWithLoopDetector<T1> {

    private Node<T1> first = null;
    int size;

    public boolean add(T1 data) {
        Node<T1> newNode = new Node<T1>(data);
        newNode.setNext(first);
        first = newNode;

        size++;
        return true;
    }

    public Node<T1> get(int nodePos) {

        Node<T1> temp = first;  // Move pointer to the initial position
        for (int counter = 0; counter < nodePos; counter++) {
            temp = temp.getNext();  // Move pointer one node ahead
        }
        return temp;
    }

    public Node<T1> getLast() {
        return get(size - 1);
    }

    public boolean hasLoop() {

        if(first == null) //list not exist
            return false;

        Node<T1> temp = first;
        Map<Node<T1>, Node<T1>> map = new IdentityHashMap<Node<T1>, Node<T1>>(size);
        while (temp != null) {
            if (map.containsKey(temp)) {
                System.out.println("duplicate Node detected having value :" + temp.getData());

                return true;
            } else {
                map.put(temp, temp);
            }
            temp = temp.getNext();
        }
        return false;
    }
}

