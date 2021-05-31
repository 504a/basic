package objectSample.streamSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Streamの基本
class StreamSample1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("a","b","c"));

        stringList.stream()//作成
                .forEach(System.out::println);//終端処理
                //.forEach(s -> System.out.println(s));
    }
}
