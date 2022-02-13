package structure.Chapter1;

/**
 * @author lcd
 * @date 2021/10/30
 * @description 快指针和慢指针
 * @File slowPintAndFastPoint.java
 * Version jdk8
 */
public class SlowPointAndFastPoint {
    public static void main(String[] args) {
        node head;
        node curr;
        node prev;
        boolean s = false;
        node p1,p2,p3,p4,p5,p6,p7;
        p1 = new node();           //实例化对象
        p1.n = 201212;
        p2 = new node();
        p2.n = 201213;
        p3 = new node();
        p3.n = 201214;
        p4 = new node();
        p4.n = 201215;
        p5 = new node();
        p5.n = 201216;
        p6 = new node();
        p6.n = 201217;
        p7 = new node();
        p7.n = 201218;
        head = p1;          //开始结点
        p1.next = p2;       //建立结点间的关系
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = null;
        prev = head;
        curr = head;
        while (prev != null  && prev.next != null){
            curr = curr.next;
            prev = prev.next.next;
            if(curr == prev){
                s = true;
                System.out.println("是环形指针");
                break;
                }
            }
        if(!s){
            System.out.println("不是循环指针");
        }

    }
}
class node{                 //定义一个结点
    public int n;           //
    public node next;       //next指针
}

