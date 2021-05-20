package objectSample.dateTimeSample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class ChronoUnitSample {
    public static void main(String[] args) {
        //経過時間のサンプル
        LocalDate birthDay = LocalDate.of(1981,11,25);

        System.out.println(ChronoUnit.DAYS.between(birthDay, LocalDate.now()));
        System.out.println(ChronoUnit.YEARS.between(birthDay, LocalDate.now()));
    }
}
