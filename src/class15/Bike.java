package class15;

public class Bike {

    static int topSpeed=200;
    static int noOfTires=2;
    String model;
    int year;

        void printTotalDistance(int noOfGallons, int avg){
        double distance=noOfGallons/10;
        System.out.println("Your bike can go max "+distance+" with this much "+noOfGallons);
    }

    public static void main(String[] args) {

        System.out.println(Bike.noOfTires);

        Bike ybr=new Bike();
        ybr.model="ybr100";
        ybr.printTotalDistance(10,20);



    }

}
