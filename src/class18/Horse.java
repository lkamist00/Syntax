package class18;

public class Horse extends Animal {



    public Horse(String name, String breed, int age, double weight){
        this.name=name; //we put this. because there is conflict between local and instance variable
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }

    public static void main(String[] args) {

        Horse horseObject=new Horse("Dorcho","Unicorn", 5, 300);
        horseObject.printInfo();

    }



}
