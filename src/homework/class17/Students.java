package homework.class17;

public class Students {

    /*
    Write java class students that have a constructor which takes students name and 3 subject grades
    inside your class also have a method to calculate average grade
    test student class for 5 different students with different marks
    your program should print an average mark for each student
     */
    String name;
    double subj1;
    double subj2;
    double subj3;

    Students(String studentName, double sub1, double sub2, double sub3){
        name=studentName;
        subj1=sub1;
        subj2=sub2;
        subj3=sub3;
    }

    void calculatePrintAvgGrade(){
        System.out.println(name+" "+(subj1+subj2+subj3)/3);
    }

    public static void main(String[] args) {

        new Students("Borela", 99,98,92).calculatePrintAvgGrade();



    }



}
