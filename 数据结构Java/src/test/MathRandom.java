package test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author lcd
 * @date 2021/11/9
 * @description 先通过Math.random（）方法产生一个随机的9位整数；再在其中插入4个乘号，使分得的5个整数的乘积最大；
 *  * 输入：正整数n；输出：被分得的5个整数、得到的最大乘积值。5份，每份长度大于0且它们之和等于9，如1+2+3+2+1=9算一种，枚举所有，比较之求最大乘积，编代码实现
 * @File MathRandom.java
 * Version jdk8
 */
public class MathRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a= new int[9];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println("生成的随机数组为："+Arrays.toString(a));
    }
}
