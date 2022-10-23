package class19;

public class Bird {

    String name;
    String color;
    int age;
    double weight;

    Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println("Name " + name + " color " + color + " age " + age + " weight " + weight);
    }
}

    class Test {
        public static void main(String[] args) {

            Parrot parrot = new Parrot("Zeki", "Green", 2, 1);
            parrot.printInfo();

            Crow crow = new Crow("Crow", "Black", 2, 1);
            crow.printInfo();

            Sparrow sparrow = new Sparrow("Sparrow", "White", 2, 1);
            sparrow.printInfo();
        }
    }
