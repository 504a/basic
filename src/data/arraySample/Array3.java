package data.arraySample;

import java.util.Arrays;

//配列への代入・参照
public class Array3 {
    public static void main(String[] args) {
        //配列の宣言と初期化
        int[] array = {10,20,30};

        //代入と参照
        array[1] = 40;//インデクス1の要素に40を代入
        System.out.println(array[2]);//30

        //配列の出力
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html
        System.out.println(array);//[I@6e8dacdfs
        System.out.println(Arrays.toString(array));//[10,40,30]

    }
}
