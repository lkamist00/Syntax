package homework.class16.modifiers;

public class Task3 {

    /*
    Create a method that will accept a String as a parameter and return a new String that consists only of vowels.
    Method should be available inside the class only where it was declared and executed by calling its name
     */

    private static String vowels(String str){
        String newStr=str.replaceAll("[^aeiouAEIOU]","");
        return  newStr;
        //return str.replaceAll("[^aeiouAEIOU]",""); -->same as code above
    }

    public static void main(String[] args) {

        //Task3 task3=new Task3();
        //System.out.println(task3.vowels("Macedonia"));

        System.out.println(Task3.vowels("Macedonia"));

    }

}
