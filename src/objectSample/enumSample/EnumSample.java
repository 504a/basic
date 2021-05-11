package objectSample.enumSample;

class EnumSample {
    //三色のどれかを判断して表示する
    public static void viewColor(Color color) {
        switch (color) {
            case RED:
                System.out.println("赤");
                break;
            case BLUE:
                System.out.println("青");
                break;
            case YELLOW:
                System.out.println("黄");
                break;
        }
    }

    public static void main(String[] args) {
        //列挙型を表示してみる
        System.out.println(Color.RED);
        viewColor(Color.YELLOW);
        System.out.println(Color.BLUE.getJpName());
    }
}
