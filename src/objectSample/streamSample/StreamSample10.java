package objectSample.streamSample;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

class StreamSample10 {
    public static void main(String[] args) {
        //変換例
        List<String> stringList = List.of("a","b","b","c");

        //任意のSet構造に変換
        Set<String> stringSet = stringList.stream().
                collect(TreeSet::new,
                        TreeSet::add,
                        TreeSet::addAll);
        stringSet.forEach(System.out::println);

        //任意のMap構造に変換
        class Word {
            private String key;
            private String value;

            public Word(String key, String value) {
                this.key = key;
                this.value = value;
            }

            public String getKey() {
                return key;
            }

            public String getValue() {
                return value;
            }
        }

        List<Word> wordList = List.of(
                new Word("Banana","バナナ"),
                new Word("Apple","りんご"),
                new Word("Chery","さくらんぼ")
        );

        Map<String,String> wordMap = wordList.stream()
                .collect(Collectors.toMap(
                        Word::getKey,
                        Word::getValue,
                        (a,b) -> b,
                        TreeMap::new
                ));

        wordMap.entrySet().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }
}
