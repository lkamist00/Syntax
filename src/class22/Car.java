package class22;

public class Car {

    void start(){
        System.out.println("Use key to start me");
    }

    void stop(){
        System.out.println("Use breaks to stop me");
    }

    void park(){
        System.out.println();
    }


    class Urus extends Car{

        void start(){
            System.out.println("Use button to start me");
        }

    }

}
