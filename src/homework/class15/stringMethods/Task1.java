package homework.class15.stringMethods;

public class Task1 {
    /*
    Create a method that will take 2 parameters as a numbers and prints which number is larger.
    */

    void larger(int num1, int num2){
        if(num1>num2){
            System.out.println(num1+" is larger");
        }else if(num2>num1){
            System.out.println(num2+" is larger");
        }else{
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {

        Task1 result=new Task1();

        result.larger(5,7);
        result.larger(15,11);




    }






}
