package data.arraySample;

//配列の宣言と初期化
public class Array2 {
    public static void main(String[] args) {
        //配列の宣言その２ 配列宣言と初期化
        int[] array1 = {10,20,30};

        //参照して出力
        System.out.println(array1[0]);//10
        System.out.println(array1[1]);//20
        System.out.println(array1[2]);//30

        //配列の宣言その３ 配列宣言と初期化
        int[] array2 = new int[] {10,20,30};

        //参照して出力
        System.out.println(array2[0]);//10
        System.out.println(array2[1]);//20
        System.out.println(array2[2]);//30
    }
}
