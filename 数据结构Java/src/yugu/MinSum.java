package yugu;

import java.util.Scanner;

/**
 * @author lcd
 * @date 2021/11/4
 * @description 输入一个k值，1 <= k <= 15，计算最大的n使Sn(Sn = 1 + 1/2 + 1/3 + ...+1/n)大于k
 * @File MinSum.java
 * Version jdk8
 */
public class MinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入K的值（1<=k<=15)");
        int k = sc.nextInt();
        float n = 0;
        float i = 1;
        if(k >= 1 && k <= 15){
            for (; n < k; i++) {
                if((n+1/i)>k){
                    break;
                }
                n += 1/i;
            }
        }else{
            System.out.println("请输入正确的k值");
        }
        System.out.println((int)(i));
    }
}
