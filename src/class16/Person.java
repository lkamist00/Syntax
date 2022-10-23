package class16;

public class Person {


    private String password="pass123";  //most restricted,only accesible within the same class, not other class from same package
                                        //default, accessed within the same class and same package
    protected double salary=1000;

    public String name="Sekade";        //accessible everywhere

    public static void main(String[] args) {

        Person person1=new Person();
        System.out.println(person1.password);
        System.out.println(person1.salary);




    }




}

class Bank{  //only one public class per file, many classes

}