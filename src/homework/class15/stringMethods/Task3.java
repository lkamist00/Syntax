package homework.class15.stringMethods;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not.

    void palindrome(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();

        if(stringBuilder.toString().equals(str)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }

    }

    public static void main(String[] args) {

        Task3 word=new Task3();

        word.palindrome("dad");
        word.palindrome("tochak");


    }




}
