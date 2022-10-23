package homework.class19;

public class Task2 {

    //write program to inherit class Z that has method printF
    // which is static and call or reuse that method into class X
}

class Z{

    static void printF(){
        System.out.println("This is static method");
    }

    class X extends Z{

    }

    public static void main(String[] args) {

        X.printF();

    }

}