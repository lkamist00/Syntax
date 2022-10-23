package homework.class14;

public class StringMethods3 {
    public static void main(String[] args) {

        /*You have a string="is it saturday? is it rainign? do we  have a class?";
        find out how many sentences are in that string
         */
        String a="Is it saturday? Is it raining? Do we have a class?";
       String[] sentences=a.split("[?]");
        System.out.println(sentences.length);


    }
}
