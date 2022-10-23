package Recap.recap5;

public class Questions {

    public static void main(String[] args) {

        //how would you reverse a String without using reverse function
        //1.use class14.StringBuilder and reverse method
        //2.use charAt();
        //3.use toCharArray(); HW

        String str="I love writing put spreads";
        String reverseString="";

        for(int i=str.length()-1; i>0; i--){
            reverseString=reverseString+str.charAt(i);
        }
        System.out.println(reverseString);

        System.out.println("---------------");
        StringBuilder sb=new StringBuilder("I love writing put spreads");
        System.out.println(sb);
        StringBuilder reverseBuilder=sb.reverse();
        System.out.println(reverseBuilder);



        //how would you find if a string is a palindrome


    }
}
