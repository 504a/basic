package intro;

//人間クラス
public class Human {
    //フィールド
    private String name;
    private String gender;
    private int age;

    //コンストラクタ
    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //ゲッター
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
