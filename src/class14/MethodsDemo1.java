package class14;

public class MethodsDemo1 {

    void printHello(){               //method that does not take parameters and prints some lines on the console
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
    }

    void printWord(String word){    //method that takes a single parameter of type String and prints it
        System.out.println(word);
    }

    public static void main(String[] args) {

        MethodsDemo1 obj=new MethodsDemo1();
        obj.printHello();

        obj.printWord("it will print the word in brackets");
        obj.printWord("calling the same method different words");


    }

}
