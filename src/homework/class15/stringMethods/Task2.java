package homework.class15.stringMethods;

public class Task2 {

   // Create a method that will take a number and prints whether the number is even or odd.

    void isEven(int num){
        if(num%2==0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }

    public static void main(String[] args) {

        Task2 number=new Task2();
        number.isEven(13);
        number.isEven(12);



    }



}
