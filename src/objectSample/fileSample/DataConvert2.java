package objectSample.fileSample;

import objectSample.exceptionSample.original.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DataConvert2 {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(
                new Person("相澤凜", Gender.WOMEN, LocalDate.parse("1996-08-22")),
                new Person("伊藤樹",Gender.MEN,LocalDate.parse("2002-02-07")),
                new Person("上野詩",Gender.WOMEN,LocalDate.parse("1984-04-15")),
                new Person("遠藤蓮",Gender.MEN,LocalDate.parse("1974-11-27")),
                new Person("太田紬",Gender.WOMEN,LocalDate.parse("1968-01-23"))
        ));

    }
}
