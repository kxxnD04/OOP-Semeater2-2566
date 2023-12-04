import java.util.*;
public class InterestAndNetMoney {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = Input.nextDouble();
        System.out.print("Input your account type (Please type A B C or X in uppercase : ");
        char type = Input.next().charAt(0);
        switch (type) {
            case 'B' -> money += money*0.02;
            case 'A', 'C' -> money += money*0.015;
            default -> money += money*0.05;
        }
        System.out.println("Your total money in one year = " + money);
    }
}
