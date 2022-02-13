package yugu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author lcd
 * @date 2021/11/21
 * @description 传智专修学院竞选学生代表，获得了 n（1 ≤n≤20000）个提名票，每个提名票都写了一个学号（从 11 到 100100 的整数）。
 * 现在要求给根据提名票整理出竞选人。将这些提名票依次排列，只保留这个学号第一次出现的位置，删除同一学号其余出现的位置。然后输出这些学号。
 * @File represent.java
 * Version jdk8
 */
public class represent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入提名票的个数");
        int a = sc.nextInt();
        int[] ba = new int[a];
        System.out.println("请输入学号1-100");
        for (int i = 0; i < a; i++) {
            int temp = sc.nextInt();
            if(temp > 0 && temp <= 100)
                ba[i] = temp;
            else
                System.out.println("超出范围");
                continue;
        }
        System.out.println(Arrays.toString(ba));
//        创建一个list集合
        List list = new ArrayList();
        for (int i = 0; i < ba.length; i++) {
//            使用list的contains，判断集合中没有相同的元素
            if (!list.contains(ba[i])){
                list.add(ba[i]);
            }

        }
        System.out.println(list);
/*        for (int t = 0; t < ba.length; t++) {
            boolean isTrue = true;
            for (int j = 0; j < ba.length; j++) {
                if (ba[t] == ba[j]){
                    isTrue = false;
                    break;
                }

            }
            if(isTrue){
                s[t] = ba[t];

            }

        }*/


    }
}
