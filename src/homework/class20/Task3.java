package homework.class20;

public class Task3 {

    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */


    static void print(String str){
        System.out.println(str);
    }

    static void print(String str, String str2){
        System.out.println(str+" "+str2);
    }

    static void print(String str, String str2, int num){
        System.out.println(str+" "+str2+" "+num);
    }

    static void print(String str, int times){
        for (int i = 0; i < times; i++) {
            System.out.println("I love "+str);
        }
    }



    public static void main(String[] args) {


        print("Kopan");
        print("Tupan", "Tupurkovski");
        print("I love writing "+"put spreads "+500);
        print("selling put spreads ",5);


    }


}
