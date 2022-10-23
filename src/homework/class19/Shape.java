package homework.class19;

public class Shape {

    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
    double radius;

    public Shape(double radius){
        this.radius=radius;
    }
}

class Circle extends Shape{

    double area;
    double pi=3.14;

    Circle(double radius){
        super(radius);
    }
    /*void calculateArea(){
        area=pi*(radius*radius);
        System.out.println(area);
    }*/

    void calculateArea(){
        System.out.println(Math.PI*Math.pow(radius,2));
    }

}

class Tester1{

    public static void main(String[] args) {
        Circle task=new Circle(5);
        task.calculateArea();
    }
}
