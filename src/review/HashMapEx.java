package review;

import java.util.HashMap;
import java.util.Map;

class HashMapEx {
    public static void main(String[] args) {
        //宣言
        Map<String,String> map = new HashMap<>();
        //追加
        map.put("a","赤");
        map.put("b","黄");
        map.put("c","青");
        //キーを指定して値を取得
        System.out.println(map.get("b"));//黄
        System.out.println(map.get("d"));//null
        //forでの例文
        //キーと値
        for (Map.Entry<String,String> entry :map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //キーのみ
        for (String key:map.keySet()) {
            System.out.println(key);
        }
        //値のみ
        for (String value:map.values()) {
            System.out.println(value);
        }
        //forEach
        map.forEach((k,v) -> System.out.println(k + ":" + v));

        //存在確認
        System.out.println(map.containsKey("b")); // true
        System.out.println(map.containsKey("z")); // false
        System.out.println(map.containsValue("黄")); // true
        System.out.println(map.containsValue("白")); // false

        //要素数
        System.out.println(map.size());//3
        map.clear();
        System.out.println(map.size());//0
        System.out.println(map.isEmpty());//true

        //追加・更新
        map.put("a","赤");
        map.forEach((k,v) -> System.out.println(k + ":" + v));//a:赤
        map.replace("a","オレンジ");
        map.forEach((k,v) -> System.out.println(k + ":" + v));//a:オレンジ
        System.out.println(map.put("a", "赤"));//置き換える
        map.forEach((k,v) -> System.out.println(k + ":" + v));//a:赤

        //削除
        map.remove("a");
        System.out.println(map.isEmpty());//true

    }
}
