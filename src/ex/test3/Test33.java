package ex.test3;

class Test33 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i+=3) {
            if(i%2==0) continue;
            if(sum>50) break;
            sum+=i;
            System.out.println("i:" + i + " sum:" + sum);
        }
        System.out.println(sum);
    }
}
