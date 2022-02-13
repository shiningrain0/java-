package blibili;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author lcd
 * @Date 2022/1/22 12:06
 * @jdk 11
 * @description 判断数字是奇数还是偶数
 */
public class oddOrEven {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //获取输入的数字
        int x = sc.nextInt();
        method1(x);
        int a = sc.nextInt();
        method2(a);
    }
    //非静态方法不能再静态类中被引用
    //Non-static method 'method1(int)' cannot be referenced from a static context
    //在
    public static void method1(int x){
        if((x & 1) == 1){
            System.out.println(x+"是奇数");
        }else{
            System.out.println(x+"是偶数");
        }
    }
    public static void method2(int x){
        if(x % 2 == 0){
            System.out.println(x+"是偶数");
        }else{
            System.out.println(x+"是奇数");
        }
    }

}
