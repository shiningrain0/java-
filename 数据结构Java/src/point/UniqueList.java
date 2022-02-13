package point;
import java.util.*;

/**
 * @author lcd
 * @date 2021/11/22
 * @description 将数组中的重复元素去除
 * @File UniqueList.java
 * Version jdk8
 */
public class UniqueList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int num = sc.nextInt();
        int[] a = new int[num];
        //向数组中填充数据
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
//        Unique1(a);
//        Uinque2(a);
//        Unique3(a);
        Unique4(a);


    }
    
    public static void Unique1(int[] a) {
        //新数组
        int[] b = new int[a.length];
        int t = 0;
        //遍历原数组
        for (int i = 0; i < a.length; i++) {
            boolean isTrue = true;
            for (int j = i+1; j < a.length; j++) {
//                如果发现又重复元素，结束当前的内层循环
                if(a[i] == a[j]){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue){
//                没有重复元素将原数组的元素赋给新的数组
                b[t] = a[t];
                t++;
            }
        }
        //此时b数组中会显示去重后的数据，同时将空闲位置补充为默认数据0,创建一个新的数组，将去重后的数据重新放入
        int[] s = new int[t];
        for (int i = 0; i < t; i++) {
            s[i] = b[i];

        }
        System.out.println(Arrays.toString(s));
    }
//使用数组中的自带的方法
     public static void Uinque2(int[] a){
        List list = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            if(!list.contains(a[i])){
                list.add(a[i]);
            }
            
        }
        System.out.println(list);
    }
    //利用Set集合无序不可重复的特性进行元素过滤
    public static  void Unique3(int[] a){
        Set set = new HashSet();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        //打印输出Set集合的数组形式
        System.out.println(set.toArray());

    }
    //使用链表的哈希集合：有顺序，不重复
    public static void Unique4(int[] a){
        Set<Object> b = new LinkedHashSet<Object>();
        for (int i = 0; i < a.length; i++) {
            b.add(a[i]);
        }
        System.out.println(b);
    }

}
