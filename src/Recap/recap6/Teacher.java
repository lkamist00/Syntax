package Recap.recap6;

public class Teacher {

    String name, lastName;
    static String school;

    Teacher(String fName, String lName){
        name=fName;
        lastName=lName;
    }

    void print(){
        System.out.println(name+" "+lastName);
    }



}
