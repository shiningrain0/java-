package lanqiaoTest;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @version 1.0
 * @Author lcd
 * @Date 2022/2/9 15:46
 * @jdk 11
 * @description 　给定n个十六进制正整数，输出它们对应的八进制数。
 * 输入的第一行为一个正整数n （1<=n<=10）。
 * 接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000
 */
public class Test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //输入第需要进行禁止转换的个数n
        int n = sc.nextInt();
        //判断个数是否符合规定
        if(n >= 1 && n <=10){
            //进行进制转换，首先将十六进制转换为二进制，再将二进制转换为八进制
            //创建一个数组进行存储,数组的长度为输入数据的个数
            String[] arrays= new String[n];
            //再进行输入时需要注意输入格式

            //判断一个字符串是否由字母和字符串组成
//            Pattern p = Pattern.compile("[0-9A-Z]");
            for(int i =0;i< arrays.length;i++){
                /*String s = sc.next();
                Matcher m = p.matcher(s);
                if(m.matches()){
                    arrays[i] = s;
                }*/
                String s = sc.next();
                if(s.length() <= 100000){
                    arrays[i] = s;
                }
            }
            //进行进制转换
            for (int i = 0; i < arrays.length; i++) {
                String s = Integer.toOctalString(Integer.valueOf(arrays[i], 16));
                System.out.println(s);
            }

        }


    }
}
