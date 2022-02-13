package javaTest;

/**
 * @author lcd
 * @date 2021/11/25
 * @description 试编程求解：1！+2！-3！+4！+5！-6！+7！+8！-9！+10！+...+20！-21！
 * @File Test3.java
 * Version jdk8
 */
public class Test3 {
    public static void main(String[] args){
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                if(i % 3 ==0){
                    sum *= i;
                    temp += sum;
                    continue;
                }else{
                    sum *= (-i);
                    temp += sum;
                    continue;

                }
            }
        }
        System.out.println(temp);
    }

}
