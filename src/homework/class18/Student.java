package homework.class18;

public class Student {

    /*
    Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.

     */
        String name;
        String address;

        void displayInfo(){
            System.out.println(name+" "+address);
        }

        public Student(String name, String address) {
            this.name = name;
            this.address = address;
        }


    public static void main(String[] args) {

        Student student1=new Student("Kopan","WPB");
        student1.displayInfo();


    }

}
