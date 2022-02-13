package lanqiaoTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author lcd
 * @Date 2022/2/2 15:49
 * @jdk 11
 * @description 给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200,每个整数的绝对值小于10000。
 */
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //指定数列的长度
        int n = sc.nextInt();
        //判断数列的长度是否大于等于1且小于等于200
        if(n >=1 && n <= 200){
            //将数列的长度设置为用户键入的长度
            int [] array = new int[n];
            Scanner st = new Scanner(System.in);
            String s = st.nextLine();
            String[] str = s.split(" ");
            for (int i = 0; i < str.length; i++) {
                if (Math.abs(Integer.parseInt(str[i]))<1000)
                    array[i] = Integer.parseInt(str[i]);
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length-1; j++) {
                    if (array[i]<array[j]){
                        int temp;
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                if(i == array.length-1){
                    System.out.println(array[i]);
                }else{
                    System.out.print(array[i]+" ");
                }
            }
        }
    }
}

