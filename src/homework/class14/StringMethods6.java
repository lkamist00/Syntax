package homework.class14;

public class StringMethods6 {
    public static void main(String[] args) {

        /* How would you swap 2 strings withoud temporary variable?
         */
        String str1="python";
        String str2="java";

        str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");

        System.out.println(str1);
        System.out.println(str2);





    }
}
