package objectSample;

//メソッドの記述
class MethodLib {
    /**
     * 整数を２つ加算するメソッド
     * @param x 整数１ int
     * @param y 整数２ int
     * @return 整数１ + 整数２ int
     */
    public static int plus(int x,int y) {
        return x + y;
    }

    public static double ave(double[] array) {
        double sum = 0.0;
        for (double value:array) {
            sum += value;
        }
        return sum / array.length;
    }
}

class MethodSample {
    public static void main(String[] args) {
        int answer = MethodLib.plus(20,30);
        System.out.println(answer);//50
        System.out.println(MethodLib.plus(10,20));//30
        double[] array = {1,2,3,4,5};
        System.out.println(MethodLib.ave(array));//3.0
    }
}
