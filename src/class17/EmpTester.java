package class17;

import java.util.Scanner;

public class EmpTester {

    public static void main(String[] args) {

        Employee kopan=new Employee("Kopan","Writing options",1000000, 30);

        kopan.printSalary();
        kopan.calculatePrintTax();


         /*
        Below we have more constrcutor calls
         */
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Str");
        String str=new String("value");


    }
}
