package structure.Chapter1;

/**
 * @author lcd
 * @date 2021/10/29
 * @description 建立一个用于存放梵高等数学成绩表的但链表
 * @File Student.java
 * Version jdk8
 */
public class Student02 {


    public static void main(String[] args) {
        Stud2 head;                 //学生单链表的开始结点
        Stud2 p1,p2,p3,p4,p5,p6,p7;
        p1 = new Stud2();           //实例化对象
        p1.no = 201212;
        p1.name = "张三";
        p1.score = 88;
        p2 = new Stud2();
        p2.no = 201213;
        p2.name = "丽华";
        p2.score = 78;
        p3 = new Stud2();
        p3.no = 201214;
        p4 = new Stud2();
        p4.no = 201215;
        p4.name = "郑和";
        p4.score = 98;
        p5 = new Stud2();
        p5.no = 201216;
        p5.name = "李四";
        p5.score = 85;
        p6 = new Stud2();
        p6.no = 201217;
        p6.name = "蒂芬";
        p6.score = 88;
        p7 = new Stud2();
        p7.no = 201218;
        p7.name = "余乐";
        p7.score = 90;
        head = p1;          //开始结点
        p1.next = p2;       //建立结点间的关系
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = null;     //尾结点的next属性设置为null
        System.out.println(head.no+ head.score+head.name);
        System.out.println(head.next);
    }
}
class Stud2{                //学生节点类
    public  int no;         //学生学号
    public String name;     //存放姓名
    public int score;       //存放学生成绩
    public Stud2 next;
}
