import java.util.*;
public class NewLineEvery5line {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int line = input.nextInt();
        for (int i = 1; i <= line; i++) {
            System.out.print((i%5 != 0 ? "|" : "|\n"));
        }System.out.println();
    }
}
