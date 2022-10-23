package homework.class14;

public class StringMethods5 {
    public static void main(String[] args) {
        // find out if word is a palindrome

        String str="dad";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();

        if(stringBuilder.toString().equalsIgnoreCase(str)){
            System.out.println("Word is a palindrome");
        }else{
            System.out.println("Word is not a palindrome");
        }


    }
}
