package homework.class17;

public class Task3 {

    /*
    Write a java class that have 4 constructors with 4 different acces levels of constructors
    and create 4 objects of this
    class 1 inside same class; class 2 from outside class; 3 from different class and package
     */

    private Task3(){
        System.out.println("private");
    }

    Task3(String name){
        System.out.println("default");
    }

    protected Task3(int age){
        System.out.println("protected");
    }

    public Task3(boolean isTrue){
        System.out.println("public");
    }

    public static void main(String[] args) {

        new Task3();
        new Task3("Kopan");
        new Task3(30);
        new Task3(true);




    }

}
