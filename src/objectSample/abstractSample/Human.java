package objectSample.abstractSample;

//抽象クラスのサンプル
abstract class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    //抽象メソッド 戻り値とメソッド名と引数のみ宣言されている
    //処理が記述されていない
    public abstract void hello();
}
