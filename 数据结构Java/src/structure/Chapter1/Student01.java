package structure.Chapter1;

/**
 * @author lcd
 * @date 2021/10/29
 * @description 使用Java中的对象数组来存储高等数学成绩表
 * @File Student01.java
 * Version jdk8
 */
public class Student01 {
    public static void main(String[] args) {
        Stu1[] st = new Stu1[7];                    //存放记录的数组
        st[0] = new Stu1(2018123,"王华",56);
        st[1] = new Stu1(2018134,"琉璃",64);
        st[2] = new Stu1(2018125,"陈铭",78);
        st[3] = new Stu1(2018126,"张倩",89);
        st[4] = new Stu1(2018128,"徐冰",67);
        st[5] = new Stu1(2018129,"黎平",45);
        st[6] = new Stu1(2018120,"李银",93);
        System.out.println(st);                     //此时输出的为数组st的地址
        for(int i = 0;i < st.length;i++){           //遍历输出数组中的每一条数据
            System.out.println(st[i].no+","+st[i].name+","+st[i].score);
        }
    }

}
class Stu1{
    int no;                                         //存放学号
    String name;                                    //存放姓名
    int score;                                      //存放分数
    public Stu1(int no1,String name1,int score1){  //创建一个全参的构造方法
        no = no1;
        name = name1;
        score = score1;
    }
}
