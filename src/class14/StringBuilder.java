package class14;

public class StringBuilder {
    public static void main(String[] args) {


        //class14.StringBuilder - faster, larger memory
        //String - slower, lower memory
        //Strings do not allow any method to change the original content - immutable, unlike class14.StringBuilder - mutable

        java.lang.StringBuilder stringBuilder=new java.lang.StringBuilder("Intellij is great");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        String country="USA";
        String home="USA";

        java.lang.StringBuilder state1=new java.lang.StringBuilder("New York");
        java.lang.StringBuilder state2=new java.lang.StringBuilder("New York");





    }
}