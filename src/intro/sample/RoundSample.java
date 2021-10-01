package intro.sample;

//四捨五入・切り上げ・切り捨てのサンプル
public class RoundSample {
    public static void main(String[] args) {
        double num = 123.456;

        //切り上げ
        System.out.println(Math.ceil(num));
        //切り捨て
        System.out.println(Math.floor(num));
        //四捨五入（小数点第一位）
        System.out.println(Math.round(num));
        //四捨五入（小数点第一位）
        System.out.println(Math.round(num * 10.0) /10.0);
    }
}
