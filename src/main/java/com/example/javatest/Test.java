package com.example.javatest;

/**
 *
 */
public class Test {

    public static void main(String[] args) {

        System.out.println(add(5, 5));
        System.out.println(sub(5, 5));
        System.out.println(mul(5, 5));
        System.out.println(div(5, 0));

        System.out.println(inverse(5));
        System.out.println(backwards(5));
        System.out.println(abs(-5));

        System.out.println(max(3, 5));
        System.out.println(min(3, 5));

        calculatorDouble(5.3);

        System.out.println(Math.log(10));
        System.out.println(pow(2,2));

    }

    //加
    static double add(double number1, double number2) {
        return number1 + number2;
    }

    // 减
    static double sub(double number1, double number2) {
        return number1 - number2;
    }

    // 乘
    static double mul(double number1, double number2) {
        return number1 * number2;
    }

    // 除
    static double div(double number1, double number2) {
        return number1 / number2;
    }

    // 相反数
    static double inverse(double number) {
        return -number;
    }

    // 倒数
    static double backwards(double number) {
        return 1 / number;
    }

    // 绝对值
    static double abs(double number) {
        return number > 0 ? number : -number;
    }

    // 两数较大
    static double max(double number1, double number2) {
        return number1 > number2 ? number1 : number2;
    }

    // 两数较小
    static double min(double number1, double number2) {
        return number1 < number2 ? number1 : number2;
    }

    // 对double数进行计算
    static void calculatorDouble(double d) {
        int max = (int) d + 1;
        System.out.println(max);
        int min = (int) d;
        System.out.println(min);
        double sqrt = d * d;
        System.out.println(sqrt);
    }

    // x = log(d),e为底数，计算x的值
    static double log(double d) {
        return Math.log(d);
    }

    // 求a^b的值
    static double pow(double a, double b) {
        double result = 1;
        if (b == 0) {
            return 1;
        } else {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        }
        return result;
    }

}







