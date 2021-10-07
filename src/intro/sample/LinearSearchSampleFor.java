package intro.sample;

import java.util.Arrays;

//線形探索法(番兵法)
public class LinearSearchSampleFor {
    public static void main(String[] args) {
        //整数型配列の宣言
        int[] array = {10,-10,20,100,0};

        //探索したい値を設定
        int searchValue = 100;

        //未発見であることを判定する変数を設定
        boolean unDiscovered = true;

        //配列を表示
        System.out.println(Arrays.toString(array));

        //反復処理をしつつ探索
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                System.out.println("探索値:" + searchValue);
                System.out.println("配列の要素:" + i + "に存在します");
                unDiscovered = false;//未発見ではないことの設定
                break;//探索値を発見したので反復を中断
            }
        }

        //未発見の場合の表示
        if (unDiscovered) System.out.println("探索値:" + searchValue + "は見つかりませんでした");
    }
}
