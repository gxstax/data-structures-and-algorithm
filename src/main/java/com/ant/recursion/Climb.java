package com.ant.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * 题型：简单
 * <p>
 * 爬楼梯：
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * </P>
 *
 * @author Ant
 * @since 2025/8/16 16:49
 **/
public class Climb {

    int deep = 0;

    Map<Integer, Integer> hasSolvedList = new HashMap<>();

    /**
     * <p>
     * 使用递归操作：
     * 爬 n 阶楼梯的方案等于爬 n-1 阶楼梯的方案数 + 爬 n-2 阶楼梯的方案数;
     *
     * 缺点：空间复杂度高、有堆栈溢出的风险、存在重复计算、过多的函数调用会耗时较多等问题；
     * <p/>
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        ++deep;
        if (deep > 1003403200) {
            throw new RuntimeException("too deep");
        }

        // 终止条件
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }

        if (hasSolvedList.containsKey(n)) {
            return hasSolvedList.get(n);
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * <p>
     * 使用动态规划：
     * 爬 n 阶楼梯的方案等于爬 n-1 阶楼梯的方案数 + 爬 n-2 阶楼梯的方案数;
     * <p/>
     *
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        // 终止条件
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }

        int ret = 0;
        int pre = 2;
        int prepre = 1;
        for (int i = 3; i <= n; i++) {
            ret = pre + prepre;
            prepre = pre;
            pre = ret;
        }

        return ret;
    }




    public static void main(String[] args) {
        Climb solution = new Climb();
        System.out.println(solution.climbStairs(35));
    }
}
   
