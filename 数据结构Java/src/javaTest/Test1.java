package javaTest;

/**
 * @author lcd
 * @date 2021/11/25
 * @description 求解”鸡兔同笼问题”:鸡和兔在一个笼里，共有腿100条、头40个，问鸡兔各几只。
 * @File Test1.java
 * Version jdk8
 */

/*
* 分析：
* 一只鸡有两条腿，一个兔子有四条腿
* 一共有40个头
* 设鸡有x只，兔子有y只，有x+y = 40,2x+4y = 100 即可得兔10只，鸡30只
* */
public class Test1 {
    public static void main(String[] args) {
        //设鸡有x只，兔子有y只
        int x,y = 0;
        for ( x = 0; x <= 40 ; x++) {
            for (y = 0; y <= 40 ; y++) {
                if((x+y == 40) && (2*x + 4*y ==100))
                    System.out.println("鸡："+x+"兔:"+y);
            }
        }
    }

}
