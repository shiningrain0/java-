package structure.Chapter3;

/**
 * @author lcd
 * @date 2021/11/15
 * @description  创建一个栈 并进行进栈出栈的操作，输出栈中的数据
 * @File Stack01Test.java
 * Version jdk8
 */
public class Stack01Test {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.empty();
        s.push(9);
        s.push(6);
        s.pop();
        s.pop();
        s.push(7);
        s.push(10);
        System.out.println("栈顶元素为：" + s.peek());
        s.p();

    }
    public static class Stack<E>{
        private int capacity = 10;        //栈的容量
        private int top;                //栈顶
        private E[] data;               //存放栈中的元素

        public Stack(){
        data =(E[]) new Object[capacity];   //强制转换为E类型数组
        top =-1;                            //设置top初始值
    }
    public boolean empty(){             //判断栈是否为空
        if(top == -1)
            System.out.println("栈为空");
        return top == -1;
    }
    public void push(E e){            //进栈
        if(top == capacity - 1)
            throw new IllegalArgumentException("栈满");
        top++;
        data[top] = e;
    }
    public E pop(){
        if(empty())
            throw new IllegalArgumentException("栈空");
        E e = (E)data[top];
        top--;
        return e;
    }
   /* public E pop(){
        return (E) data[top--];
    }*/
    public E peek(){
        if(empty())
            throw new IllegalArgumentException("栈空");
        return (E)data[top];
    }
    public void p(){
        System.out.println("栈中的元素为：");
        //将i的初值设为top  遍历输出栈中所有的数据根据栈顶指针进行遍历栈中剩余的数据
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
    }
}
