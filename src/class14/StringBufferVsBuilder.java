package class14;

public class StringBufferVsBuilder {

    public static void main(String[] args) {
        //Mostly used class, newer, better, faster
        //StringBuilder stringBuilder=new StringBuilder("Today is java class");

        //older, slow and not used mostly
        StringBuffer stringBuffer=new StringBuffer("Today is java class");

        String str="Java is very easy";
        //StringBuilder stringBuilder1=new StringBuilder(str);        //from String to stringBuilder
        //System.out.println("stringBuilder1 = " + stringBuilder1);
       // String newStr=stringBuilder1.toString();                    //from stringBuilder to String



    }
}
