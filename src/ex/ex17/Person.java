package ex.ex17;

import objectSample.exceptionSample.original.Gender;

import java.time.LocalDate;

class Person {
    private String name;
    private Gender gender;
    private LocalDate birth;

    /*
        コンストラクタに与えるデータ形式
        名前 name 文字列
        性別 gender 列挙型 Gender
        誕生日 LocalDate 引数はISO文字列 文字型 2005-02-15
     */

    /*
        getter
        名前は文字列で、性別は「男 or 女」
        誕生日は 2005/02/15
        getAge()は年齢を取得できる 16
     */
}
