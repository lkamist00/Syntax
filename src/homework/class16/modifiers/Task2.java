package homework.class16.modifiers;

public class Task2 {

    /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

   public static String reverseStr(String str){
       StringBuilder stringBuilder=new StringBuilder(str);
       stringBuilder.reverse();
       String str2=stringBuilder.toString();
       return str2;
       //return new class14.StringBuilder(str).reverse().toString(); -->same as code above
   }

    public static void main(String[] args) {

        // Task2 task2=new Task2();
        // System.out.println(task2.reverseStr("reverse this"));
        System.out.println(Task2.reverseStr("Reverse this"));

    }






}
