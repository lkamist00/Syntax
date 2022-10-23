package class19;

    class Parrot extends Bird{

        Parrot(String name, String color, int age, double weight) {
            super(name, color, age, weight);
        }
       /* this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }*/
    }

    class Crow extends Bird {
        Crow(String name, String color, int age, double weight) {
            super(name, color, age, weight);
        /*this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }*/
        }
    }

class Sparrow extends Bird{
    Sparrow(String name, String color, int age, double weight) {
        /*this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;*/
        super(name, color, age, weight);
    }
}

