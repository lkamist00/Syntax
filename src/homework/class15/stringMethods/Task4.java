package homework.class15.stringMethods;

public class Task4 {

   // Create a method that will say Hello in different language based on the country that will passed when method is executed

    void sayHello(String country){
        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "Macedonia":
                System.out.println("Zdravo");
                break;
            case "Spain":
                System.out.println("Hola");
                break;
            default:
                System.out.println("Unknown");

        }

    }

    public static void main(String[] args) {

        Task4 task4 = new Task4();

        task4.sayHello("USA");
        task4.sayHello("Macedonia");
        task4.sayHello("France");


    }


}
