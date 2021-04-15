package intro;

//人間クラスのインスタンスを作成する
public class HumanSample {
    public static void main(String[] args) {
        //インスタンスを作成する
        Human human1 = new Human("やまだ","男",35);
        Human human2 = new Human("たけだ","女",24);

        //各データを表示する
        System.out.println(human1.getName());
        System.out.println(human1.getGender());
        System.out.println(human1.getAge());

        System.out.println(human2.getName());
        System.out.println(human2.getGender());
        System.out.println(human2.getAge());

        System.out.println(human1);
        System.out.println(human2);
    }
}
