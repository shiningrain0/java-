package lanqiaoTest;
import java.util.Scanner;
/**
 * @version 1.0
 * @Author lcd
 * @Date 2022/2/7 11:40
 * @jdk 11
 * @description 闰年的判断
 */
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //从键盘键入一个整数
        int y = sc.nextInt();
        if(y >= 1990 && y <= 2050){
            if(y % 4==0 && y % 100 !=0 || y % 400 ==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
