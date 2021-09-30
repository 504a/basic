package intro.order;

public class If4 {
    public static void main(String[] args) {
        int score = 65;

        if (score >=80) {
            System.out.printf("A");
        } else if (score >= 70) {
            System.out.printf("B");
        } else if (score >= 50) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
