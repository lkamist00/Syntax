package class14;

import java.util.Arrays;

public class StringRecap {

    public static void main(String[] args) {

        String str="kkgfsdfASDASD123123@#%$^#@#";
        str=str.replaceAll("[^a-zA-Z]", "");
        System.out.println("str = " + str);

        String sentence="I like writing options. I like writing put spreads! I don't like them going in the money";
        String[] split = sentence.split("[.!]");
        System.out.println("split = " + Arrays.toString(split));

        String str2="I like writing options. I like writing put spreads! I don't like them going in the money";
        String replace=str2.replaceFirst("writing","selling");
        System.out.println(replace);


    }
}
