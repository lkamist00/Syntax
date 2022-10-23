package homework.class15Task1;

public class Student {

    /*
        Create a class called Students
        3 variables, Name, ID, and numberOfStudents
        Create 3 objects of Students class
        Set the value for studentName, studentID, and increment the numberOfStudents for each object
        Print out the total number of students
     */

    String name;
    String id;
    static int numberOfStudent;

    public static void main(String[] args) {

        Student andrew=new Student();
        andrew.id="1";
        andrew.name="Roman";
        Student.numberOfStudent++;

        Student tate=new Student();
        tate.id="2";
        tate.name="Tate";
        Student.numberOfStudent++;

        System.out.println(Student.numberOfStudent);
        System.out.println(Student.numberOfStudent);



    }



}
