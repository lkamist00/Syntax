package homework.class20;

public class Task4 {

    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    private static void add(String str){
        System.out.println(str);
    }

    private static  void add(String str, int num, int num2){
        System.out.println(str+" "+num+" "+num2);
    }

    private static void add(String str, int times){
        for (int i = 0; i < times; i++) {
            System.out.println("I love "+str);
        }
    }

    public static void main(String[] args) {


        add("Lets see what prints");
        add("String word plus two numbers ", 10,100);
        add("I love SPX ", 5);

    }

}
