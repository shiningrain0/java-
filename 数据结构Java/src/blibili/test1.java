package blibili;

import javax.rmi.CORBA.Util;
import javax.xml.transform.Result;
import java.util.Random;

/**
 * @version 1.0
 * @Author lcd
 * @Date 2022/1/26 15:57
 * @jdk 11
 * @description 1-1000这1000个三个数放在含有1001个元素的数组中，只有唯一的一个元素值重复，其
 * 它均值出现一次，每一个元素只能访问一次，设计一个算法，将他找出来，不用辅助的存储空间，能否设计一个算法实现
 */
public class test1 {
     public static void main(String[] args){
         //先采用少量的数据进行测试
         int N = 11;
         //创建数组并设定数组的长度
         int[] arr = new int[N];
         //先对数组进行遍历填值
         for(int i = 9;i < arr.length-1;i++){
             arr[i]=i+1;
         }
         //使用随机数获取一个可重复的值
         int index = new Random().nextInt(N-1)+1;
         //找一个随机下标
         arr[arr.length -1] = new Random().nextInt(N);
         /*Util.swap(arr,index,arr.length-1);
         Util.print(arr);*/
     }
     
}
