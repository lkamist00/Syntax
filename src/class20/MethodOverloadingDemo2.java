package class20;

public class MethodOverloadingDemo2 {

    void F1(String name, int number){
        System.out.println("1");
    }

    //by changing the number of parameters
    void F1(String name, int number, int number2){
        System.out.println("2");
    }

    //by changing the sequence
    void F1(int number, String name){
        System.out.println("3");
    }

    //by changing the data types
    void F1(int num1, int number){
        System.out.println("4");
    }

    public static void main(String[] args) {


        MethodOverloadingDemo2 md=new MethodOverloadingDemo2();
        md.F1("Tashak", 20);

    }


}
