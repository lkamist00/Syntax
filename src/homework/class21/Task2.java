package homework.class21;

public class Task2 {

    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
}

class CreditCard{

    double balance;
    double interestRate;
    double totalInterest;

   CreditCard(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }


    void calculateInterest(){
        totalInterest=interestRate*balance/100;
        System.out.println(totalInterest);
    }

}

class Visa extends CreditCard{

    Visa(double balance, double interestRate){
        super(balance,interestRate);
    }

    void calculateInterest() {
        double totalInterest=interestRate*balance/100;
        System.out.println(totalInterest+5);
    }

}

class AX extends CreditCard{

    AX(double balance, double interestRate){
        super(balance, interestRate);
    }

    @Override
    void calculateInterest() {
        double totalInterest=interestRate*balance/100;
        System.out.println(totalInterest+10);
    }
}

