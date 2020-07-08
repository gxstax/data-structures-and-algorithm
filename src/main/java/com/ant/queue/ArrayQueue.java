package com.ant.queue;

import org.omg.CORBA.Object;

/**
 * <p>
 * 顺序队列（数组实现）
 * </p>
 *
 * @author Ant
 * @since 2020/7/8 12:45 下午
 */
public class ArrayQueue<E> {

    /** 队列默认长度 **/
    private static Integer DEFAULT_LENGTH = 8;
    
    /**
     * 队列头数组下标
     */
    private Integer head;

    /**
     * 队列尾数组下标
     */
    private Integer tail;

    /**
     * 数组大小
     */
    private Integer length;

    /**
     * 队列
     */
    private Object[] eleArray;

    public ArrayQueue() {
        this.eleArray = new Object[DEFAULT_LENGTH];
        this.head = 0;
        this.tail = 0;
        this.length = 0;
    }
    
    /**
     * <p>
     * 出队
     * </p>
     *
     * @return void
     */
    public void pop() {

    }

    /**
     * <p>
     * 入队
     * </p>
     *
     * @param
     * @return void
     */
    public void push(E e) {

    }
}
