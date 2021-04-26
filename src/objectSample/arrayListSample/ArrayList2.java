package objectSample.arrayListSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayListの検索
class ArrayList2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Tom","Bob","Jhon"));
        System.out.println(list);

        //要素の検索
        if (list.contains("Bob")) {
            //Bobは存在する
            int index = list.indexOf("Bob");
            System.out.println(index + ":" + list.get(index));//1:Bob
        } else {
            System.out.println("not find:bob");
        }
    }
}
