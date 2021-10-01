package intro.operator;

//算術演算子
public class ArithmeticOperator {
    public static void main(String[] args) {
        //算術演算子(二項演算子)
        int a = 5,b = 3;
        System.out.println("算術演算子（二項）");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

        //算術演算子(単項演算子)
        //符号・インクリメント・デクリメント
        int e = 1,f = 2;
        System.out.println("算術演算子（単項）");
        System.out.println("-e:" + -e);//-1
        System.out.println("e:" + e++);//1
        System.out.println("f:" + ++f);//3
        System.out.println("e++ + ++f:" + (e++ + ++f));//2+4=6
        System.out.println("e:" + e);//3
        System.out.println("f:" + f);//4

        //ワイドニング
        double c = 5;
        int d = 3;
        System.out.println(c + " + " + d + " = " + (c + d));
        System.out.println(c + " - " + d + " = " + (c - d));
        System.out.println(c + " * " + d + " = " + (c * d));
        System.out.println(c + " / " + d + " = " + (c / d));
        System.out.println(c + " % " + d + " = " + (c % d));

        //ナローイング
        int g;
        double h = 10;
//        g = h;
        g = (int)h;//明示的なキャスト（型変換）


        //代入演算子
        int i,j;
        i = j = 10;
        System.out.println("i:" + i);//10
        System.out.println("j:" + j);//10

        //複合代入演算子
        //例 x = x + 1;
        //x += 1;　と記述できる
        int x = 1;
        System.out.println(x+=1);//2
        System.out.println(x*=10);//20
    }
}
