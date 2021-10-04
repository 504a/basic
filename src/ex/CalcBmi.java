package ex;

import java.util.Scanner;

//BMIと適性体重を求める
public class CalcBmi {
    /**
     * 実数の入力メソッド
     * @param message String 表示メッセージ
     * @return double 入力された値
     */
    static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);//キーボード入力をするインスタンスを作成
        System.out.println(message);
        return scanner.nextDouble();//入力された値をdouble型で返す
    }

    public static void main(String[] args) {
        //身長・体重の入力
        double height = inputDouble("身長を入力してください（単位 m）");
        double weight = inputDouble("体重を入力してください（単位 kg）");

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

        //体型の表示
        if (bmi >= 40) {
            System.out.println("判定：肥満(4度)");
        } else if(bmi >= 35) {
            System.out.println("判定：肥満(3度)");
        } else if(bmi >= 30) {
            System.out.println("判定：肥満(2度)");
        } else if(bmi >= 25) {
            System.out.println("判定：肥満(1度)");
        } else if(bmi >= 18.5) {
            System.out.println("判定：普通");
        } else {
            System.out.println("判定：低体重");
        }
    }
}
