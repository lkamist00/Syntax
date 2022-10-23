package homework.class21;

public class Task1 {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
     */

    public static void main(String[] args) {

        Degree degree=new Degree();
        degree.getPrerequisite();

        Bacherlors bacherlors=new Bacherlors();
        bacherlors.getPrerequisite();

        Masters masters=new Masters();
        masters.getPrerequisite();

    }
}

class Degree{

    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }

}

class Bacherlors extends Degree{

}

class Masters extends Degree{

    void getPrerequisite() {
        System.out.println("To get a degree you need bachelors diploma");
    }
}

