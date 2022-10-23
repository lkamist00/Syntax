package Recap.recap5;

public class StringMethods {

    public static void main(String[] args) {

        String str=" hello ";

        //str.toUpperCase; --   //Strings do not allow any method to change the original content - immutable, unlike class14.StringBuilder - mutable
        //toUpperCase or toLowerCase
        str.toUpperCase();
        System.out.println(str);

        str=str.toUpperCase();
        System.out.println(str);

        //length(); --> gives how many characters in the string, length of the string
        int size=str.length();
        System.out.println(str.length());

        //charAt(); --> returns char value of specified index
        char letter=str.charAt(0);
        System.out.println(letter);//H

        //how to get last character
        char lastLetter=str.charAt(str.length()-1);
        System.out.println(lastLetter);//O

        //indexOf --> Returns the index within this string of the first occurrence of the specified character
        int index=str.indexOf(lastLetter);
        System.out.println(index);//4
        System.out.println(str.indexOf('a'));//prints -1 if it cant find character

        //isEmpty(); --> boolean, returns true if string empty, if only 1 character returns false
        boolean empty=str.isEmpty();
        System.out.println(empty);




    }
}
