package intro;

//人間クラスのインスタンスを作成する
public class HumanSample {
    public static void main(String[] args) {
        //インスタンスを作成する
        Human human1 = new Human("やまだ","男",35);

        //各データを表示する
        System.out.println(human1.getName());
        System.out.println(human1.getGender());
        System.out.println(human1.getAge());
    }
}
