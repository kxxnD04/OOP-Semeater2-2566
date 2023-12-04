import java.util.*;
public class BuyComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, dvd, printer;
        System.out.println("please insert your monitor size 38 or 43 only");
        size = input.nextInt();
        System.out.println("Do you want DVD-ROM? 1 is Yes / 0 is No");
        dvd = input.nextInt();
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        printer = input.nextInt();
        System.out.println("======= Your order =======");
        System.out.println("* computer >>> 375.99$");
        System.out.println("* "+size+"'Monitor >>> "+(size == 43 ? 99.99:75.99)+ "$");
        if (dvd == 1) {System.out.println("* DVD-Rom >>> 65.99$");}
        if (printer == 1) {System.out.println("* printer >>> 125.00$");}
        System.out.print("=======");
        System.out.print(" Total price >>> ");
        System.out.print(375.99 + (size == 43 ? 99.99 : 75.99)
                + (dvd == 1 ? 65.99 : 0.0) + (printer == 1 ? 125.00 : 0)
        + " ==========");
    }
}
