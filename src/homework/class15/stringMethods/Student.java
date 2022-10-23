package homework.class15.stringMethods;

public class Student {

     /*
    Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */

    char getGrade (int num) {
        char grade;
        if (num > 90) {
            grade= 'A';
        } else if (num > 80) {
            grade= 'B';
        } else if (num > 70) {
            grade= 'C';
        } else if (num > 50) {
            grade= 'D';
        } else {
            grade= 'F';
        }
        return grade;
    }


    public static void main(String[] args) {

        Student grades = new Student();

        System.out.println(grades.getGrade(75));
        System.out.println(grades.getGrade(95));
        System.out.println(grades.getGrade(40));

    }
}
