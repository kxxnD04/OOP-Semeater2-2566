import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double area;
    double radius = input.nextDouble();
    area = Math.PI*radius*radius;
    System.out.print(area);
    }
}
