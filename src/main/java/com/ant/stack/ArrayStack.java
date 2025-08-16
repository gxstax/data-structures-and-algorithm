package com.ant.stack;

/**
 * <p>
 * TODO
 * </P>
 *
 * @author Ant
 * @since 2025/8/15 23:04
 **/
public class ArrayStack {

    /**
     * 数组
     */
    private String[] items;

    /**
     * 栈中元素个数
     */
    private int count;

    /**
     * 栈的大小
     */
    private int n;

    /**
     * 初始化长度为n的栈
     *
     * @param n 栈的大小
     */
    public void ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    /**
     * 入栈
     *
     * @param item  入栈元素
     * @return  boolean 是否成功入栈
     */
    public boolean push(String item) {
        if (count == n) {
            return false;
        }
        items[count] = item;
        count++;
        return true;
    }

    /**
     * <p>
     * 出栈
     * </p>
     *
     * @return
     */
    public String pop() {
        if (count == 0) {
            return null;
        }
        String tmp = items[count - 1];
        count--;
        return tmp;
    }
}
   
