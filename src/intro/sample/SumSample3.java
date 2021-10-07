package intro.sample;

import java.util.Arrays;

//配列の合計 while版
public class SumSample3 {
    public static void main(String[] args) {
        //整数型配列の宣言
        int[] array = {20,30,10,50,40};
        //合計を保存する変数の宣言
        int sum = 0;

        //反復処理をしつつ合計を求める
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));

        //合計を表示
        System.out.println("配列の合計:" + sum);
    }
}
