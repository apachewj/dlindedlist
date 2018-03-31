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
     * 双链表往前插入一个元素
     * @param e
     * @return
     */
    public DoubleLinkedList<T> prepend(T e) {

        if (this.first == null) {
            this.first = new DNode<T>(e, null, null);
            this.last = this.first;
        } else {
            DNode<T> first_old = this.first;
            DNode<T> first_new = new DNode<T>(e, null, first_old);
            first_old.setPrev(first_new);
            this.first = first_new;
        }
        return this;
    }

    /**
     * 双链表往后追加一个元素
     * @param e
     * @return
     */
    public DoubleLinkedList<T> append(T e) {
        if (this.last == null) {
            this.last = new DNode<T>(e, null, null);
            this.first = this.last;
        } else {
            DNode<T> last_old = this.last;
            DNode<T> last_new = new DNode<T>(e, last_old, null);
            last_old.setNext(last_new);
            this.last = last_new;
        }
        return this;
    }

    /**
     * 双链表转置
     * @return
     */
    public DoubleLinkedList<T> reverse() {

        return this;
    }
}
