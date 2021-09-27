package data;

//リテラルの書き方
public class Literal {
    public static void main(String[] args) {
        //整数リテラル
        int num1 = 10;//10進数
        int num2 = 012;//8進数
        int num3 = 0xA;//16進数
        int num4 = 0b1010;//2進数

        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        System.out.println("num4:" + num4);

        //型によるリテラル
        long num5 = 1L;//long型を明示
        float num6 = 3.14f;//float型を明示
        float num7 = 3f;//float型を明示
        double num8 = 3d;//double型を明示

        System.out.println("num5:" + num5);
        System.out.println("num6:" + num6);
        System.out.println("num7:" + num7);
        System.out.println("num8:" + num8);

        //浮動小数点の指数表記
        double num9 = 0.123e+2;//0.123*10^2
        double num10 = 0.123e-2;//0.123*10^-2
        System.out.println("num9:" + num9);//12.3
        System.out.println("num10:" + num10);//0.00123

        //文字型リテラル
        char c1 = 'A';
        char c2 = '\u0041';//unicode
        char c3 = 65;//整数

        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
        System.out.println("c3:" + c3);

        //文字列型
        String str1 = "abc";
        String str2 = "あいうえお";

        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
    }
}
