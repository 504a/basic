package data;

//変数の宣言の仕方
public class Variable {
    public static void main(String[] args) {
        //整数型
        byte b = 10;
        short s = 32000;
        int i = 100;
        long l = 10000;

        //浮動小数点型
        float f = 12.34f;
        double d = 123.456;

        //文字型
        char c1 = 'A';
        char c2 = '\u0041';//Unicode

        //真偽値型
        boolean bool = true;//true or false

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(bool);
    }
}
