package javaTest;

/**
 * @author lcd
 * @date 2021/11/25
 * @description 求解”百鸡问题”:已知公鸡每只3元，母鸡每只5元；每3只小鸡1元，现需用100元买100只鸡，问每种鸡应各买多少只。
 * @File Test2.java
 * Version jdk8
 */
public class Test2 {
    public static void main(String[] args) {
//        设公鸡x只,母鸡y只，小鸡z只
        int x,y = 0,z = 0;
        for (x = 0; x < 100; x++) {
            for (y = 0; y < 100; y++) {
                for (z = 0; z < 100; z++) {
                    if((x+y+z == 100) && (3 * x + 5 * y + z/3 ==100)&&(z%3 ==0))
                        System.out.println("cock="+y+",hen="+x+",小鸡="+z);
                }
            }
        }
    }
}
