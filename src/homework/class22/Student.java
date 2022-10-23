package homework.class22;

public class Student {

       /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
    void study(){
        System.out.println("Students must study");
    }

    void doHomeWork(){
        System.out.println("Must solve homeworks");
    }

    void doPractice(){
        System.out.println("Must practice");
    }

}

class SyntaxStudent extends Student{

    void doHomeWork(){
        System.out.println("Syntax students must solve repls");
    }

    @Override
    void doPractice() {
        System.out.println("Syntax students must practice");
    }
}


class CollegeStudent extends Student{
    @Override
    void doPractice() {
        System.out.println("College students must practice to pay off loans");
    }
}

class SchoolStudent extends Student{

}




