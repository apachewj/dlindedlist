package com.structure;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseTest{

    private DoubleLinkedList<Integer> doubleLinkedList;

    @Before
    public void testBefore() {
        // 初始化一个双链表
        doubleLinkedList = new DoubleLinkedList<Integer>();
        doubleLinkedList.append(1);
        doubleLinkedList.append(2);
        doubleLinkedList.append(3);
        doubleLinkedList.append(4);
        doubleLinkedList.append(5);
        doubleLinkedList.append(6);
        // 打印双链表
        System.out.println(doubleLinkedList.toString());
    }

    @Test
    public void testRevers() {
        // 执行转置方法
        doubleLinkedList.reverse();
    }

    @After
    public void testPrint() {
        // 打印转置后的结果
        System.out.println(doubleLinkedList.toString());
    }
}
