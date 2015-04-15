package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: stanimir
 * Date: 4/15/15
 * Time: 7:39 PM
 * developer STANIMIR MARINOV
 */
public class Node<T1> {
    private T1 data;
    private Node<T1> next = null;

    public Node(T1 data) {
        this.data = data;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Node<T1> getNext() {
        return next;
    }

    public void setNext(Node<T1> next) {
        this.next = next;
    }

    public T1 getData() {
        return data;
    }
}
