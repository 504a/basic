package objectSample.setSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Setサンプル
class Set1 {
    public static void main(String[] args) {
        //整数型HashSetを定義
        Set<Integer> set = new HashSet<>();
        //データ追加する
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        //表示する
        System.out.println(set);
        //存在する値は追加されない
        System.out.println(set.add(1));//false
        System.out.println(set);
        //存在しない値は追加される
        System.out.println(set.add(6));//true
        System.out.println(set);
        //値を複数追加する
        System.out.println(set.addAll(Arrays.asList(7, 8, 9)));//true
        System.out.println(set);
        System.out.println(set.addAll(Arrays.asList(9,10)));//true
        System.out.println(set);
        System.out.println(set.addAll(Arrays.asList(9,10)));//false
        System.out.println(set);
        //値を削除する
        System.out.println(set.remove(10));//true
        System.out.println(set);
        System.out.println(set.remove(10));//false
        System.out.println(set);
        //合致する値を全て削除する
        System.out.println(set.removeAll(Arrays.asList(7, 8, 9)));//true
        System.out.println(set);
        System.out.println(set.removeAll(Arrays.asList(6,7)));//true
        System.out.println(set);
        System.out.println(set.removeAll(Arrays.asList(6,7)));//false
        System.out.println(set);
        //合致しない値を全て削除する
        System.out.println(set.retainAll(Arrays.asList(1, 2, 3)));//true
        System.out.println(set);
        //値を全て削除
        set.clear();
        System.out.println(set);
        //サイズの取得
        System.out.println(set.size());//0
        //空であるか？
        System.out.println(set.isEmpty());//true
        set.add(1);
        System.out.println(set.isEmpty());//false
        //ArrayListからSet変換
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,3,3));
        System.out.println(list);//1,2,2,3,3,3
        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println(integerSet);//1,2,3
        //値の存在を判定する
        System.out.println(integerSet.contains(2));//true
        System.out.println(integerSet.contains(4));//false
        System.out.println(integerSet.containsAll(Arrays.asList(1, 2, 3)));
        System.out.println(integerSet.containsAll(Arrays.asList(1, 2, 4)));

    }
}
