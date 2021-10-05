package ex;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

//じゃんけん
public class Rps {
    public static void main(String[] args) {
        //乱数の発生
        Random random = new Random(LocalDateTime.now().getSecond());
        int cpu = random.nextInt(3);//0,1,2の三種類の値が発生する
        //int cpu = 2;

        //プレイヤーの手の入力
        Scanner scanner = new Scanner(System.in);
        System.out.println("あなたの手を選んでください");
        System.out.println("0.グー 1.チョキ 2.パー");
        int player = scanner.nextInt();

        //CPUの手を表示
        switch (cpu) {
            case 0:
                System.out.println("CPU:グー");
                break;
            case 1:
                System.out.println("CPU:チョキ");
                break;
            case 2:
                System.out.println("CPU:パー");
                break;
        }

        //あなたの手を表示
        switch (player) {
            case 0:
                System.out.println("あなた:グー");
                break;
            case 1:
                System.out.println("あなた:チョキ");
                break;
            case 2:
                System.out.println("あなた:パー");
                break;
        }

        //勝敗の結果表示
        if(cpu == player) {
            System.out.println("あいこです");
        } else if (cpu == 1 && player == 0//cpu チョキ player グー
            || cpu == 2 && player ==1//cpu パー player チョキ
            || cpu == 0 && player == 2) {//cpu グー player パー
            System.out.println("あなたの勝ちです");
        } else {
            System.out.println("あなたの負けです");
        }
    }
}
