package Recap.recap6;

public class Shelter {

    public static void main(String[] args) {

        Dog.breed="Shi Tzu";
        Dog dog1=new Dog();

        //how to access instance variables
        dog1.name="Teddy";
        dog1.weight=15;
        dog1.printInfo();

        Dog dog2=new Dog();
        System.out.println(dog2.name);
        dog2.name="Lucy";
        dog2.weight=9;
        System.out.println(dog2.name);
        dog2.printInfo();

        dog1.name="Teddiko";
        dog1.breed="Wolf"; //change to static variable changes the value for all objects

        dog1.printInfo();
        dog2.printInfo();

        String str="hello";
        int size=str.length();

        System.out.println("------------------");
        double price1=dog1.dogPrice();
        System.out.println(price1);

        double price2=dog2.dogPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        System.out.println("------------------");
        dog1.love("treat");
        dog2.love("Teddy");


    }

}
