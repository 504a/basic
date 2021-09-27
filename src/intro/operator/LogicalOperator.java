package intro.operator;

//論理演算子
public class LogicalOperator {
    public static void main(String[] args) {
        boolean t = true,f = false;


        //論理積（AND）
        System.out.println("論理積（AND）");
        System.out.println("f && f " + (f && f));//false
        System.out.println("t && f " + (t && f));//false
        System.out.println("f && t " + (f && t));//false
        System.out.println("t && t " + (t && t));//true

        //論理和（OR）
        System.out.println("論理和（OR）");
        System.out.println("f || f " + (f || f));//false
        System.out.println("t || f " + (t || f));//true
        System.out.println("f || t " + (f || t));//true
        System.out.println("t || t " + (t || t));//true

        //否定（NOT）
        System.out.println("!f " + (!f));//true
        System.out.println("!t " + (!t));//falses
    }
}
