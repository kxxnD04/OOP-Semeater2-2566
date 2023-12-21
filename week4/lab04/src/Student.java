public class Student {
    public String name;
    public double mScore, fScore;
    public void showGrade(){
        double s = (mScore*0.4) + (fScore*0.4) +20;
        char grade = 0;
        if (s < 50) {grade = 'F';}
        if (s >= 50 & s < 60) {grade = 'D';}
        if (s >= 60 & s < 70) {grade = 'C';}
        if (s >= 70 & s < 80) {grade = 'B';}
        if (s >= 80) {grade = 'A';}
        System.out.println("Your grade is " + grade + ".");
    }
}
