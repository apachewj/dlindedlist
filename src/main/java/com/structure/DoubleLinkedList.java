package com.structure;

import java.util.NoSuchElementException;

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
    public DoubleLinkedList<T> reverse() throws NoSuchElementException{
        if (this.first == null || this.last == null) {
            throw new NoSuchElementException();
        }
        if (this.first != this.last) {
            // 交换首尾节点
            DNode<T> temp = this.first;
            this.first = this.last;
            this.last = temp;

            // 迭代并交换所有节点的prev和next
            DNode<T> node = this.last;
            while (node.getPrev() != null) {
                temp = node.getPrev();
                node.setPrev(node.getNext());
                node.setNext(temp);
                node = temp;
            }
            // 最后一个节点
            if (node != null) {
                node.setPrev(node.getNext());
                node.setNext(null);
            }
        }
        return this;
    }

    public String toString() {
        DNode<T> node = this.first;
        StringBuilder sb = new StringBuilder();
        boolean isBegin = true;
        do{
            if (isBegin) {
                sb.append(node.toString());
                isBegin = false;
            } else {
                sb.append( " >> " + node.toString());
            }
        }while (node.getNext() != null);
        return sb.toString();
    }

    public static void main(String args[]) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();
        doubleLinkedList.append(Integer.valueOf(1));
        doubleLinkedList.append(Integer.valueOf(2));
        doubleLinkedList.append(Integer.valueOf(3));
        doubleLinkedList.append(Integer.valueOf(4));
        doubleLinkedList.append(Integer.valueOf(5));

        System.out.println(doubleLinkedList);
    }
}
