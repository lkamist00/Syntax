package class18;

public class Car { //parent class/ base class
    String model;
    String make;
    int age;
    String color;
    int topSpeed;
    private double price;
    //if a field or method has private access modifier in the parent class, the child class can't use it


    void printCarDetails(){
        System.out.println("Model "+model+" make "+make+" color "+color);
    }
}

    class BMW extends Car{          //child class/ derive class
    double engineCC;


}

    class Lamborghini extends Car{

}

    class RollsRoyce extends Car{

}

class carTester {
    public static void main(String[] args) {

        BMW bmw = new BMW();
        bmw.make="BMW";
        bmw.color="Gold";
        bmw.model="M5 Competition";
        bmw.printCarDetails();

    }
}







