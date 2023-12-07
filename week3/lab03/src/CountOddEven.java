import java.util.*;
public class CountOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int odd = 0, even = 0, num = 0;
        while (num != -1) {
            num = input.nextInt();
            if (num != -1) {
                even += num%2 == 0 ? 1 : 0;
                odd += num%2 != 0 ? 1 : 0;
            }
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
