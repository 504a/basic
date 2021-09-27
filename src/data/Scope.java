package data;

public class Scope {
    public static void main(String[] args) {
        int x = 10;
        {
            int y = 100;
            {
                int z = 1000;
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
            System.out.println(x);
            System.out.println(y);
            //System.out.println(z);
        }
        System.out.println(x);
        //System.out.println(y);
        //System.out.println(z);
    }
}
