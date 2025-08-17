package com.ant.queue.disruptor;

/**
 * <p>
 * disruptor 队列
 * 生产者-消费者 模型
 * </P>
 *
 * @author Ant
 * @since 2025/8/16 16:17
 **/
public class Queue {
    private Long[] data;

    private int size = 0;

    private int head = 0;

    private int tail = 0;

    /**
     * <p>
     * 入队
     * <p/>
     *
     * @param ele   入队数据
     * @return      入队结果
     */
    public boolean enQueue(Long ele) {
        // 队列已满
        if ((tail + 1) % size == head) {
            return false;
        }

        data[tail] = ele;
        tail = (tail + 1) % size;

        return true;
    }

    /**
     * <p>
     * 出队
     * <p/>
     *
     * @return      出队结果
     */
    public Long deQueue() {
        if (head == tail) {
            return null;
        }
        Long enData = data[head];
        head = (head + 1) % size;
        return enData;
    }
}
   
