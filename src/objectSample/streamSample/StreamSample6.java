package objectSample.streamSample;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

class StreamSample6 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5);

        //一覧
        System.out.println("元のデータ" + integerList);

        //合計を求める
        int sum = integerList.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println("合計:" + sum);

        //平均を求める
        OptionalDouble ave = integerList.stream()
                .mapToDouble(i -> (double) i)
                .average();
        System.out.println("平均:" + ave.orElse(0));

        //データの個数を求める
        long count = integerList.stream()
                .filter(i -> i % 2 == 1)
                .count();
        System.out.println("奇数の個数:" + count);//3

        //最小値を求める
        Optional<Integer> min = integerList.stream()
                .min(Comparator.naturalOrder());
        System.out.println("最小値:" + min.orElse(0));//1

        //最大値を求める
        Optional<Integer> max = integerList.stream()
                .max(Comparator.naturalOrder());
        System.out.println("最大値:" + max.orElse(0));//5

        //処理の範囲を限定する
        int sum2 = integerList.stream()
                .skip(2)
                .limit(2)
                .mapToInt(i -> i)
                .sum();
        System.out.println("要素を2個スキップしてから要素を2個加算:" + sum2);//7
    }
}
