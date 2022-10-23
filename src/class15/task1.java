package class15;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class task1 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.reverse();

        for (int i = 0; i < stringBuilder.length(); i++) {
            System.out.print(stringBuilder.charAt(i));
        }



    }
}