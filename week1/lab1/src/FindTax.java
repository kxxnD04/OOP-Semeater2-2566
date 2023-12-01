import java.util.Scanner;
public class FindTax {
    public static void main(String[] args) {
    Scanner INPUT = new Scanner(System.in);
    double price;
    price = INPUT.nextDouble();
    System.out.println(price+(price*0.07));
    }
}
