package data.arraySample;

//配列の基礎
public class Array1 {
    public static void main(String[] args) {
        //配列の宣言その１ 空の配列を宣言
        int[] array = new int[3];//サイズ３の整数型配列を宣言

        //値の代入
        array[0] = 10;//インデックス0の要素の値に10を代入
        array[1] = 20;//インデックス1の要素の値に20を代入
        array[2] = 30;//インデックス2の要素の値に30を代入

        //参照して出力
        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30

    }
}
