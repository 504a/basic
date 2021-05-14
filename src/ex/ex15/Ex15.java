package ex.ex15;

import objectSample.exceptionSample.original.Gender;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Ex15 {
    /**
     * 検索メソッド
     * @param no Integer 検索したい番号(no)
     * @param personMap Map<Integer,Person> 検索対象のMap
     * @return Optional<Person> 検索結果(nullの場合有)
     */
    public static Optional<Person> searchPerson(Integer no,Map<Integer,Person> personMap) {
            return Optional.ofNullable(personMap.get(no));
    }

    public static void main(String[] args) {
        /*
            Personクラスをフィールドnoで検索出来る処理をMapを使って作成しなさい。
            検索するメソッドsearchPersonを作成してOptional<Person>で戻り値を作成するメソッドを作成すること。

         */

        //personMapの作成
        Map<Integer,Person> personMap = new HashMap<>();

        //Personクラスのインスタンスを作成
        Person person1 = new Person(1,"Bob", Gender.MEN,28);
        Person person2 = new Person(2,"Nancy",Gender.WOMEN,42);

        //personMapにPersonクラスのインスタンスを追加
        personMap.put(person1.getNo(),person1);
        personMap.put(person2.getNo(),person2);

        //検索の実行
        int key = 1;//存在する
        searchPerson(key,personMap).ifPresentOrElse(
                p -> System.out.println(p),//存在した場合の処理
                () -> System.out.println("Not find."));//存在しなかった場合の処理

        key = 3;//存在しない
        searchPerson(key,personMap).ifPresentOrElse(
                p -> System.out.println(p),//存在した場合の処理
                () -> System.out.println("Not find."));//存在しなかった場合の処理
    }
}
