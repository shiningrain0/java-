package structure.Chapter3;

/**
 * @author lcd
 * @date 2021/11/16
 * @description 涉及一个算法，利用顺序栈检查用户输入的表达式中的括号是否配对（假设表达式中可能含有小括号、中括号、大括号）并用线管数据进行测试
 * @File Stack02.java
 * Version jdk8
 */
public class Stack02 {
    public static class SQStack<E>{
        int capacity = 10;  //设置顺序栈的初始值
        private E[] data;   //存放顺序栈中的元素
        private int top;    //设置一个栈顶元素
        public SQStack(){       //构造方法，实现data和top的初始化
            data = (E[]) new Object[capacity];  //强制转换E类型为数组
            top =- 1;
        }
        private void updatecapacity(int newcapacity){       //改变新的容量为newcapacity
            E[] newdata = (E[])new Object[newcapacity];
            for (int i = 0; i < top; i++)                   //复制原来的元素
                newdata[i] = data[i];
            capacity = newcapacity;                         //设置新的容量
            data = newdata;                                 //仍由data标识数组
        }
        private boolean empty(){
            if(top == -1)
                throw new IllegalArgumentException("栈空");
            return top == -1;
        }
        private E pop(){
            if(top == capacity-1)
                throw new IllegalArgumentException("栈满");
            E e = (E)data[top];
            top --;
            return e;
        }
        private void push(E e){
            if(top == capacity -1)
               throw new IllegalArgumentException("栈空");
            top++;
            data[top] = e;
        }


    }
   /* public static boolean  isMatch(String str){
        int i = 0;
        char e,x;
        SQStack<Character> st = new SQStack<Character>();     //建立一个顺序栈
        while (i < str.length()){
            //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
            e = str.charAt(i);
            if (e=='('|| e=='['||e=='{')
                st.push(e);
            else{
                if(e == '}'){
//                    if(st)
                }
            }
        }

    }*/
}
