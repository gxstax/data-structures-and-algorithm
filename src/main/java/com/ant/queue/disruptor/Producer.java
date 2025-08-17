package com.ant.queue.disruptor;

/**
 * <p>
 * 生产者
 * </P>
 *
 * @author Ant
 * @since 2025/8/16 16:18
 **/
public class Producer {
    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    public void produce(Long data) {
        while (!queue.enQueue(data)) {
            // 队列已满，等待消费者消费
        }
    }
}
   
