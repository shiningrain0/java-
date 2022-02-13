package lanqiaoTest;
import java.math.BigInteger;
import java.util.Scanner;
/**
 * @version 1.0
 * @Author lcd
 * @Date 2022/2/7 11:48
 * @jdk 11
 * @description 阶乘的计算
 */

public class Test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //从键盘键入整数n
        int n = sc.nextInt();
        //计算n的阶乘
        if (n <= 1000) {
            BigInteger sum = new BigInteger("1");
            for (int i = 1; i <= n; i++) {
                sum=sum.multiply(BigInteger.valueOf(i));
            }
            System.out.println(sum);
        }

    }
}
/*
 * 小结：
 * 1、在进行计算的时候应注意数据类型的数值范围
 * 2、BigInteger支持任意精度的整数，可以准确的表示任何大小的整数值
 * 3、要使用BigInteger类，首先要创建一个BigInteger对象BigInteger num = new BigInteger("num1");这里数字num1的双引号是必需的，因为 BigInteger 类构造方法要求参数是字符串类型。
 * 4、BigInteger类不支持直接与数值进行运算，需要调用对应的方法例如：add()、subtract()、multiply()、divide()
 * */