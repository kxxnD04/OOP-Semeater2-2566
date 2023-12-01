import java.util.Scanner;
public class FindSeconds {
    public static void main(String[] args) {
        double hours, minutes;
        Scanner INPUT = new Scanner(System.in);
        hours = INPUT.nextDouble();
        minutes = INPUT.nextDouble();
        System.out.println((hours*60+minutes)*60);
    }
}
