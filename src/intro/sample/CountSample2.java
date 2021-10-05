package intro.sample;

import java.util.Arrays;

//条件に一致したデータの個数を数える（条件 0以上）
//拡張for版
public class CountSample2 {
    public static void main(String[] args) {
        //整数型配列の宣言
        int[] array = {-10,15,0,30,-20};

        //カウントを保存する変数の宣言
        int count = 0;

        //反復処理をしつつ０以上の数の個数を数える
        for (int value:array) {
            //配列の要素が正の数ならカウントを増やす
            if (value >= 0) count++;
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));

        //条件に一致したデータの数を表示
        System.out.println("0以上のデータの個数:" + count);
    }
}
