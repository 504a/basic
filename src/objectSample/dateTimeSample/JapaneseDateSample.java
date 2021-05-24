package objectSample.dateTimeSample;

import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

class JapaneseDateSample {
    public static void main(String[] args) {
        //OpenJDKではver12から令和対応
        JapaneseDate date = JapaneseDate.of(2019,1,1);
        System.out.println(date);
        System.out.println(DateTimeFormatter.ofPattern("GGGGy年M月d日（EEEE）").format(date));
    }
}
