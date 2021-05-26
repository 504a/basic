package objectSample.fileSample;

import objectSample.exceptionSample.original.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Person {
    private String name;
    private Gender gender;
    private LocalDate birth;

    public Person(String name, Gender gender, LocalDate birth) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }

    public Person(String name,String gender,String birth) {
        this.name = name;
        this.gender = "男".equals(gender) ? Gender.MEN:Gender.WOMEN;
        this.birth = LocalDate.parse(birth);
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d",
                name,gender.getName(),birth,getAge());
    }

    public String toCsv() {
        return String.join(",",
                name,
                gender.getName(),
                DateTimeFormatter.ofPattern("yyyy-MM-dd").format(birth));
    }

    /**
     * 年齢を取得する
     * @return 年齢 Long
     */
    public Long getAge() {
        return ChronoUnit.YEARS.between(birth, LocalDateTime.now());
    }
}
