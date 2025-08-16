package com.ant.queue;

/**
 * <p>
 * 循环队列（数组实现）
 * </p>
 *
 * @author Ant
 * @since 2020/7/8 12:47 下午
 */
public class CircularQueue {
    /**
     * 队头索引
     */
    private int head = 0;

    /**
     * 队尾索引
     */
    private int tail = 0;

    /**
     * 队列长度
     */
    private int length = 0;

    /**
     * 队列信息
     */
    private String[] queue;

    public CircularQueue(int capacity) {
        this.length = capacity;
        this.queue = new String[capacity];
        this.head = 0;
        this.tail = 0;
    }

    public boolean enQueue(String data) {
        // 队列已满
        if ((tail + 1)%length == head) {
            return false;
        }

        queue[tail]  = data;
        tail = (tail + 1) % length;

        return true;
    }

    /**
     * <p>
     * 出队
     * </p>
     *
     * @return  出队数据
     */
    public String deQueue() {
        if (head == tail) {
            return null;
        }

        String enData = queue[head];
        head = (head + 1) % length;
        return enData;
    }
}
