package com.structure;

public class DoubleLinkedList<T> {
    private DNode<T> first;
    private DNode<T> last;

    public DNode<T> getFirst() {
        return first;
    }

    public void setFirst(DNode<T> first) {
        this.first = first;
    }

    public DNode<T> getLast() {
        return last;
    }

    public void setLast(DNode<T> last) {
        this.last = last;
    }

    /**
     *
     * @param e
     * @param prev
     * @param next
     * @return
     */
    public DoubleLinkedList<T> prepend(T e, DNode<T> prev, DNode<T> next) {

        return this;
    }

    /**
     *
     * @param e
     * @param prev
     * @param next
     * @return
     */
    public DoubleLinkedList<T> append(T e, DNode<T> prev, DNode<T> next) {

        return this;
    }
}
