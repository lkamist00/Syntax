package homework.class15Task1;

public class Task1Tester {

    public static void main(String[] args) {

        SyntaxEmployee kopanEmp=new SyntaxEmployee();
        kopanEmp.empId="123";
        kopanEmp.salary=100000;
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee tupanEmp=new SyntaxEmployee();
        tupanEmp.empId="345";
        tupanEmp.salary=100000;
        System.out.println(tupanEmp.CEO);


    }

}
