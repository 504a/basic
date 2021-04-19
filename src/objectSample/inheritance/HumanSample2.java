package objectSample.inheritance;

//スーパークラスとサブクラス
class HumanSample2 {
    public static void main(String[] args) {
        //サブクラスはスーパークラスの型でまとめられる
        Human[] humans = {
                new Human("Tom"),
                new Japanese("たけし"),
                new Chinese("李"),
                new French("Gabriel")
        };

        for (Human human:humans) {
            human.hello();
        }
    }
}
