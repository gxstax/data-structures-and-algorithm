package com.ant.queue;

/**
 * <p>
 * 基于链表实现的队列
 * </P>
 *
 * @author Ant
 * @since 2025/8/16 14:02
 **/
public class LinkedListQueue {
    private Node head;
    private Node tail;

    private int size;

    /**
     * <p>
     * 入队
     * <p/>
     *
     * @param data      入队数据
     * @return boolean  入队结果
     */
    public void enQueue(String data) {
        if (tail == null) {
            head = new Node(data, null);
            tail = head;
            return;
        }

        tail.next = new Node(data, null);
        tail = tail.next;
    }

    /**
     * <p>
     * 出队
     * </p>
     *
     * @return
     */
    public String deQueue() {
        if (head == null) {
            return null;
        }
        String data = head.data;
        head = head.next;

        return data;
    }


    private static class Node<E> {
        String data;
        Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
   
