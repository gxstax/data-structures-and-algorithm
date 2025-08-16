package com.ant.queue;

/**
 * <p>
 * 顺序队列（数组实现）
 * </p>
 *
 * @author Ant
 * @since 2020/7/8 12:45 下午
 */
public class ArrayQueue {

    /** 队列默认长度 **/
    private static Integer DEFAULT_LENGTH = 8;
    
    /**
     * 队列头数组下标
     */
    private int head;

    /**
     * 队列尾数组下标
     */
    private int tail;

    /**
     * 数组大小
     */
    private int length;

    /**
     * 队列
     */
    private String[] items;

    public ArrayQueue(int capacity) {
        this.items = new String[capacity];
        this.head = 0;
        this.tail = 0;
        this.length = capacity;
    }
    
    /**
     * <p>
     * 入队
     * </p>
     *
     * @return void
     */
    public boolean enqueue(String e) {
        // 如果尾指针和队列长度相等，则队列已满
        if (tail == length) {
            // tail == length && head ==0,表示整个个队列已满
            if (head == 0) {
                return false;
            }
            // 如果head !=0,但是到队尾，已经不能再入队了，则进行数据迁移
            for (int t = head; t <= tail; t++) {
                items[t-head] = items[t];
            }
            // 数据搬移完成后，重新设置头尾指针
            head = 0;
            tail -= head;
        }

        items[tail] = e;
        ++tail;

        return true;
    }

    /**
     * <p>
     * 出队
     * </p>
     *
     * @param
     * @return void
     */
    public String push(String e) {
        // 如果head == tail 表示队列为空
        if (head == tail) {
            return null;
        }

        String item = items[head];
        ++head;
        return item;

    }
}
