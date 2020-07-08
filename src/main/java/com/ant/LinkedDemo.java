package com.ant;

import com.ant.linked.OneWayLinkedList;

/**
 * <p>
 * 链表练习
 * </p>
 *
 * @author Ant
 * @since 2020/7/7 9:15 下午
 */
public class LinkedDemo {
    /**
     * <p>
     * 链表反转
     * </p>
     *
     * @param
     * @return void
     */
    public void linkedReversal() {
        OneWayLinkedList link = initLink();

    }


    public static OneWayLinkedList initLink() {
        OneWayLinkedList link = new OneWayLinkedList();
        link.linkHead(1);
        link.linkHead(2);
        link.linkHead(3);
        link.linkHead(4);

        return link;
    }
}
