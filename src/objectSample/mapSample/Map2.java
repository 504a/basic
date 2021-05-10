package objectSample.mapSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Map活用法
class Map2 {
    //List→Map
    public static Map<String,Member> toMap(List<Member> member) {
        Map<String,Member> memberMap = new HashMap<>();
        for (Member m:member) {
            memberMap.put(m.getId(),m);
        }
        return memberMap;
    }

    public static void main(String[] args) {
        //MemberのArrayListを作成する
        List<Member> member = new ArrayList<>();
        List<Member> linkedMember = new LinkedList<>(member);

        member.addAll(Arrays.asList(
                new Member("1","Tom"),
                new Member("2","Bob"),
                new Member("3","Jhon")
        ));
        //一覧
        System.out.println(member);

        //変換
        Map<String,Member> map = Map2.toMap(member);
        System.out.println(map);

        //検索
        String key = "1";
        if (map.containsKey(key)) {
            //存在している
            System.out.println(map.get(key));
        } else {
            System.out.println("key:" + key + "は見つかりません");
        }
    }

}
