package Recap.recap6;

public class Dog {

    String name; //instance variable
    int weight;  //instance variable
    static String breed;

    void printInfo(){
        System.out.println("Dog features: "+name+", "+weight+", "+breed);
    }

    //create a method to calculate price
    //if weight is more then 5pounds price will be 100$
    //                          >10                300
    //                          >20                1000


    void love(String thing){
        System.out.println(name+" loves "+thing);
    }

    double dogPrice() {
        if (weight < 5) {
            return 100;
        } else if (weight < 10) {
            return 300;
        } else {
            return 1000;
        }
    }
        //create a method that will return bark type
        //if weight is less then 5 pounds noice will be quiet
        //if weight is less then 20 pounds noice will be medium
        //if weight is less then 50 pounds noice will be loud

       String bark(){
            String noise;
            if (weight<5) {
                noise="quiet";
            } else if(weight<10) {
                noise="medium";
            }else {
                noise="loud";
            }
            return noise;
        }







}
