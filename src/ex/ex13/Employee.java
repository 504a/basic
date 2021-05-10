package ex.ex13;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int no;
    private String name;
    private String gender;
    private String age;
    private List<Integer> sales = new ArrayList<>(12);

    public Employee(int no, String name, String gender, String age) {
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

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d");
    }
}
