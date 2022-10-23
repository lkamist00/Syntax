package homework.class20;

public class Task1 {

    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
    Use separate class to test your code
     */
    int lenght;
    int width;
    int height;

    void calculateArea(int lenght) {
        System.out.println(lenght * lenght + " square");
    }

    void calculateArea(int lenght, int width) {

        System.out.println(lenght * width + " rectangle");
    }

    void calculateArea(int lenght, int width, int height) {
        System.out.println(lenght * width * height + " box");
    }


    public static void main(String[] args) {

        Task1 test = new Task1();
        test.calculateArea(2);
        test.calculateArea(2, 5);
        test.calculateArea(2, 5, 10);

    }
}


