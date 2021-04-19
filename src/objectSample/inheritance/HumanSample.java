package objectSample.inheritance;

//継承のサンプル
class HumanSample {
    public static void main(String[] args) {
        Human human1 = new Human("Tom");
        human1.hello();//Hello my name is Tom.
        Japanese japanese1 = new Japanese("たけし");
        japanese1.hello();//こんにちは、私の名前はたけしです。
        Chinese chinese1 = new Chinese("李");
        chinese1.hello();//我的名字是李。
        French french1 = new French("Gabriel");
        french1.hello();//Je m'appelle Gabriel.
    }
}
