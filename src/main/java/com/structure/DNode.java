package com.structure;

public class DNode<T> {
    private T e;
    private DNode prev;
    private DNode next;

    public DNode(T e, DNode prev, DNode next) {
        this.e = e;
        this.prev = prev;
        this.next = next;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return e.toString();
    }
}
