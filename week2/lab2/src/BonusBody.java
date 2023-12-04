import java.util.*;
public class BonusBody {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = 0;
        System.out.print("Please insert your name : ");
        String name = input.nextLine();
        System.out.print("Please insert your age : ");
        int age = input.nextInt();
        System.out.print("Please insert number of working days : ");
        int work = input.nextInt();
        System.out.print("Please insert number of absent days : ");
        int absent = input.nextInt();
        System.out.print("Please insert your body weight : ");
        double weight = input.nextDouble();
        System.out.println("Hi, " + name);
        if (age > 20 & age <= 30) {salary = work*300 - absent*50;}
        if (age > 30 & age <= 40) {salary = work*500 - absent*50;}
        if (age > 40 & age <= 50) {salary = work*1000 - absent*25;}
        if (age > 50 & age <= 60) {salary = work*3000;}
        System.out.println("Your salary is " + (salary >= 0 ? salary : 0) + " Baht");
        if (weight >= 10 & age <= 60) {salary += 5000;}
        if (weight >= 61 & age <= 90) {salary += 5000-((weight-60)*10);}
        System.out.println("Your salary and bonus is " + (salary >= 0 ? salary : 0) + " Baht");
    }
}
