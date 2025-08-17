package com.ant.queue.disruptor;

/**
 * <p>
 * 消费者
 * </P>
 *
 * @author Ant
 * @since 2025/8/16 16:18
 **/
public class Consumer {
    private Queue queue;
    public Consumer(Queue queue)
    {
        this.queue = queue;
    }

    public void consume()
    {
        while (true)
        {
            Long data = queue.deQueue();
            if (data != null)
            {
                System.out.println("消费者消费数据：" + data);
            }
        }
    }
}
   
