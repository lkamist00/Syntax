package homework.class14;

public class StringMethods2 {
    public static void main(String[] args) {

        /*Create a string that should be combination of letters, numbers, and special characters/
        Find out how many Alphanumeric characters are in the String
         */

        String str="asdasdaASDASDASD12312312^$#$^#$(*#$";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str.length());



    }
}
