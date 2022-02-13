package structure.Chapter3;

/**
 * @author lcd
 * @date 2021/11/14
 * @description 顺序栈的泛型类
 * @File Stack01.java
 * Version jdk8
 */
public class Stack01 {

    public static void main(String[] args) {
        //初始化一个泛型类对象
        SqStackClass<Integer> sq = new SqStackClass<Integer>();
        System.out.println(sq.empty());//此时栈为空
        sq.push(4);
        sq.push(6);
        sq.pop();
        sq.pop();
        sq.push(8);
        System.out.println(sq.peek());
        sq.p();
    }
    public static class SqStackClass<E>{       //顺序栈泛型类
        final int initcapacity = 10;    //顺序栈的初始容量（常量）
        private int capacity;           //存放顺序栈的容量
        private E[] data;               //存放顺序栈中的元素
        private int top;                //存放栈顶指针
        public SqStackClass(){          //构造方法,实现data和top的初始化
            data = (E[]) new Object[initcapacity];      //强制转换为E类型数组
            capacity = initcapacity;
            top =- 1;
        }
        private void updatecapacity(int newcapacity){
            E[] newdata = (E[])new Object[newcapacity];     //改变顺序栈的容量为newcapacity
            for (int i = 0; i < top; i++) {
                newdata[i] = data[i];       //复制与原来的元素
            }
            capacity = newcapacity;         //设置新容量
            data = newdata;                 //仍旧由data标识数组
        }
        public boolean empty(){             //判断栈是否为空
            return top == -1;
        }

        public boolean full(){              //判断栈是否为满
            return top == capacity -1;
        }
        //进栈
        public void push(E e){              //元素e进栈
            if(top == capacity -1)          //顺序栈栈满时倍增容量
                updatecapacity(2*(top+1));
            top++;                          //栈顶指针加一
            data[top] = e;
        }
        //出栈
        public  E pop(){
            if(empty())
                throw new IllegalArgumentException("栈空");
            E e=(E)data[top];
            top--;
            if(capacity > initcapacity && top+1 == capacity/4)  //满足要求则容量减半
                updatecapacity(capacity/2);
            return e;
        }
        //取栈顶元素
        public E peek(){
            if(empty())
                throw new IllegalArgumentException("栈空");
            return (E)data[top];
        }
        public void p(){
            System.out.println("栈中的元素为：");
            for (int i = 0; i < data.length; i++) {
                if(data[i] != null)
                    System.out.println((E)data[i]);

            }
        }

    }

}
