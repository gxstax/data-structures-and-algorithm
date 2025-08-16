package com.ant.linked;

/**
 * <p>
 * 单链表
 * </p>
 *
 * @author Ant
 * @since 2020/7/6 1:12 下午
 */
public class OneWayLinkedList<E> {

    /**
     * 链表大小
     */
    transient int size = 0;

    /**
     * 头节点
     */
    transient Node<E> head;

    /**
     * 尾节点
     */
    transient Node<E> tail;

    public OneWayLinkedList() {

    }

    public OneWayLinkedList(E node) {
        linkHead(node);
    }

    /**
     * <p>
     * 追加到头节点
     * </p>
     *
     * @param e
     * @return void
     */
    public void linkHead(E e) {
        final Node<E> h = head;
        final Node<E> eNode = new Node<E>(null, h, e);
        head = eNode;
        if (null == h) {
            tail = eNode;
        } else {
            h.pre = eNode;
        }
        size++;
    }

    public void removeHead() {
        if (size < 1) {
            throw new RuntimeException("链表为空");
        }
        Node<E> h = head;
        head = head.next;
        if (tail == h) {
            tail = null;
        }
        h = null;
        --size;
    }

    public void remove(E e) {

    }

    /**
     * <p>
     * 追加到尾节点
     * </p>
     *
     * @param e
     * @return void
     */
    public void linkTail(E e) {
        final Node<E> t = tail;
        final Node<E> eNode = new Node<E>(t, null, e);
        tail = eNode;
        if (null == t) {
            head = eNode;
        } else {
            t.next = eNode;
        }
        size++;
    }


    private static class Node<E> {
        private Node pre;
        private E date;
        private Node next;

        public Node(Node pre, Node next, E date) {
            this.pre = pre;
            this.next = next;
            this.date = date;
        }
    }


    public static void main(String[] args) {
        OneWayLinkedList list = new OneWayLinkedList();
        list.linkTail("1");
//        list.linkTail("2");
//        list.linkTail("3");

        list.removeHead();

        System.out.println("head-->" + list.head);
        System.out.println("tail-->" + list.tail);

        Node node = list.head;
        while (node != null) {
            System.out.println(node.date);
            node = node.next;
        }
        System.out.println("链表大小: " + list.size);

    }

}
