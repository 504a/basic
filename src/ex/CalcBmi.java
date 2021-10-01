package ex;

//BMIと適性体重を求める
public class CalcBmi {
    public static void main(String[] args) {
        //身長・体重の設定
        double height = 1.74;
        double weight = 69.4;

        //BMIの計算
        double bmi = weight / Math.pow(height,2);
        bmi = Math.round(bmi * 10.0) / 10.0;

        //適性体重の計算
        double appWeight = Math.pow(height,2) * 22;
        appWeight = Math.round(appWeight * 10.0) / 10.0;

        //表示
        System.out.println("身長:" + height + " m");
        System.out.println("体重:" + weight + " kg");
        System.out.println("BMI:" + bmi);
        System.out.println("適性体重:" + appWeight + " kg");
    }
}
