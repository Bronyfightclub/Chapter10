package chapter10;
public class MathTester {
    public static void main(String[] args){
        MathHelper mHelper = new MathHelper();
        System.out.println(mHelper.Pi);
        System.out.println(mHelper.PiOver2);
        System.out.println(mHelper.PiOver4);
        System.out.println(mHelper.TwoPi);
        System.out.println(mHelper.max(4D, 10D));
        System.out.println(mHelper.min(2D, 4D));
        System.out.println(mHelper.toDegrees(2.5D));
        System.out.println(mHelper.toRadians(290D));
    }
}