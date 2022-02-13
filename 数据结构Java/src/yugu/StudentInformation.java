package yugu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * @author lcd
 * @date 2021/11/22
 * @description
 * @File StudentInformation.java
 * Version jdk8
 */
public class StudentInformation {
    public static void main(String[] args) {
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生个数");
        int n = sc.nextInt();
        System.out.println("请输入成绩");
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] str = s.split(" ");

            String[][] a = new String[n][str.length];
            for (int j = 0; j < a.length; j++) {
                a[j] = new String[]{str[j]};
                System.out.println(Arrays.toString(str));
                System.out.println(Arrays.toString(a));

            }
        }*/
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入学生的个数");
        int n = sc.nextInt();
        List list = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.println("请输入姓名和成绩");
            Student stu = new Student(sc.next(),sc.nextInt(),sc.nextInt());
            String st = stu.name+" " +stu.pscore+" " +stu.qscore;
//            System.out.println(stu.name+" " +stu.pscore+" " +stu.qscore);
            list.add(st);
        }
//        System.out.println(list);
        for (Object a:list
             ) {
            System.out.println(a);
        }
    }
//    计算出最终的成绩
    public int finalscore(int pscore,int qscore){
        int fiscore = 0;
//        对期末成绩进行调分
        qscore = (int) Math.ceil(Math.sqrt(qscore) * 10);
//        百分之60的期末成绩
        pscore = (int) (pscore * 0.4);
//        百分之40的平时成绩
        qscore = (int) (qscore * 0.6);
        fiscore = pscore + qscore;
        return fiscore;
    }
}
//创建一个学生类
class Student{
    String name;
    int pscore;
    int qscore;
//    创建一个全参的构造器
    public Student(String name, int pscore, int qscore) {
        this.name = name;
        this.pscore = pscore;
        this.qscore = qscore;
    }
}
