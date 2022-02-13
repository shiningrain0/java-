package yugu;

import java.util.Scanner;

/**
 * @author lcd
 * @date 2021/11/20
 * @description 给出 N 和 k，找到一个不小于 N的正整数，满足这个数中有 k 位数字是 3，且尽可能小。
 * @File SuitNum.java
 * Version jdk8
 */
public class SuitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建一个字符串对象
        String s = sc.next();
        //将对象以空格进行分隔
        String[] num = s.split(" ");
        //获取第一个数和第二个数
        int N = Integer.parseInt(num[0]);
        int k = Integer.parseInt(num[1]);
        if (N>=1 && N <= (Math.pow(10,9))){
            if (1 <= 1 && k <= 6){
                for (int i = N; ; i++) {
                    int temp = i,sum = 0;
                    while (temp %10 == 3)
                        sum++;
                    temp /=10 ;
                }
            }

        }
    }
}
