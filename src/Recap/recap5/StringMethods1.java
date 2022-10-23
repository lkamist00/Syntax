package Recap.recap5;

public class StringMethods1 {

    public static void main(String[] args) {

        String textFromApp=" Enroll today ";
        String textFromUserStory="Enroll today";
        //trim(); --> trims empty spaces at the beggining and at the end

        if(textFromApp.trim().equals(textFromUserStory)){ //method chaining, when we use multiple methods
            System.out.println("Text matches, test passed");
        }else{
            System.out.println("Text doesn't match, test failed");
        }
        System.out.println(textFromApp.trim());
        System.out.println(textFromApp);

        //substring(); --> extract string from a string
        String str="Hello class";
        int index=str.indexOf('c');
        System.out.println(index);

        String part2=str.substring(6); //extract word class
        System.out.println(part2);

        String part1=str.substring(0,5);        //extract word Hello
        System.out.println(part1);

        //concat -->combine
        String newString=part1.concat(" ").concat(part2);
        System.out.println(newString);
        System.out.println(part1+" "+part2);

        char single=newString.substring(6).charAt(0);
        System.out.println(single);

        //newString.charAt(0).substring(6); error
        System.out.println("---------------");

        //replace(); -->replaces each substring with a new specified string
        String myString="Today is September";
        System.out.println(myString);

        myString=myString.replace("September","October");
        System.out.println(myString);

        myString=myString.replace('T','t');
        System.out.println(myString);

        System.out.println("---------------");
        // split(); -->
        String myStr="I love writing put spreads";
        String[] arr=myStr.split(" ");
        System.out.println(arr.length);//5
        System.out.println(arr[4]);    //print index number 4 of the array, spreads

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

        for(String array:arr){
            System.out.print(array+" ");
        }







    }
}
