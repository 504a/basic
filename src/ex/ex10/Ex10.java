package ex.ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Ex10 {
    public static void main(String[] args) {
        //Studentのインスタンスを格納するArrayListを作成し、
        // 6人分のインスタンスを作成しなさい。
        //1～3学年を二人ずつ作成し、1組と2組の学生で作りなさい。
        List<Student> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Student("やまだ",1,1,21,80,50,60),
                new Student("いのうえ",1,2,2,90,90,100),
                new Student("たけだ",2,1,12,40,30,25),
                new Student("みやの",2,2,18,60,60,60),
                new Student("うえだ",3,1,4,85,50,90),
                new Student("かねこ",3,2,7,100,75,85)
        ));

        //生徒の一覧を表示しなさい。
        System.out.println("一覧表示");
        for (Student s:list) System.out.println(s);

        //1年生のみ一覧表示しなさい。
        System.out.println("1年生のみ");
        for (Student s:list) {
            if (s.getGrade() == 1) System.out.println(s);
        }

        //1組だけ一覧表示しなさい。
        System.out.println("1組のみ");
        for (Student s:list) {
            if (s.getCl() == 1) System.out.println(s);
        }



    }
}
