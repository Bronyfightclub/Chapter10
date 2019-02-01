package chapter10;
public class CheckingTest {
    public static void main(String[] args){
        Checking checking1 = new Checking();
        Checking checking2 = new Checking("Jane", 200.00D);
        System.out.println(checking1.toString());
        System.out.println(checking2.toString());
        checking1.setBalance(500.01D);
        System.out.println(checking1.getBalance());
    }
}
