package lecodeLearn;

/**
 * @author lcd
 * @date 2021/11/14
 * @description 计算2^n
 * @File TimeComplexity.java
 * Version jdk8
 */
public class TimeComplexity {
    public static void main(String[] args) {
        System.out.println(TimeComplexity.algorithm(4));
    }
    static int algorithm(int N) {
        if (N <= 0) return 1;
        int count_1 = algorithm(N - 1);
        int count_2 = algorithm(N - 1);
        return count_1 + count_2;
    }

}
