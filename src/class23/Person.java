package class23;

public interface Person {

    void eat();


}

interface Employee{
    void work();
}

interface SyntaxEmployee extends Employee, Person{

}

class Asghar implements SyntaxEmployee{

    @Override
    public void eat() {
        System.out.println("Like to eat sopska");
    }

    @Override
    public void work() {
        System.out.println("Teaches QA Testing");
    }
}