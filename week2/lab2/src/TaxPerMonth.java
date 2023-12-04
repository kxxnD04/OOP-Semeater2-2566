import java.util.*;
public class TaxPerMonth {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    double salary = input.nextDouble();
    System.out.println(salary > 50000.00 ? salary*0.1 : salary*0.05);
    }
}

