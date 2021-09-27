package intro.order;

public class Continue {
    public static void main(String[] args) {
        int[] array = {1,2,-3,4,5};
        //負の数値を発見したらスキップする
        for (int value:array) {
            if (value<0) continue;//負の数ならスキップ
            System.out.println(value);//1 2 4 5
        }
    }
}
