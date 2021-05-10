package ex.ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {
    private int no;
    private String name;
    private String gender;
    private int age;
    private List<Integer> sales = new ArrayList<>(12);

    //イニシャライザ
    {
        sales.addAll(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0));
    }

    public Employee(int no, String name, String gender, int age) {
        this.no = no;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    /**
     * 月毎の売上の取得
     * @param month int 月（1～12）
     * @return int 指定した月の売上
     */
    public int getSales(int month) {
        return sales.get(month - 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d"
                ,no,name,gender,age);
    }
}
