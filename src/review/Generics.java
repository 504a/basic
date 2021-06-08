package review;

import java.util.ArrayList;
import java.util.List;

class Generics {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        List<Object> objectList = new ArrayList<>();
        objectList.add(1);
        objectList.add("a");
        int num1 = (int) objectList.get(0);
        int num2 = (int) objectList.get(1);
    }
}
