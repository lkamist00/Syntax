package homework.class19;

public class Task3 {
    /*
    Write a Java program called Teacher.
      Identify features and behaviour of that Class.
      Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
      Test all 4 classes
     */
}

class Teacher {

    protected String name;
    protected String lastName;
    protected int age;

    Teacher(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


    void teach() {
        System.out.println(name + " is teaching");
    }

    void yell() {
        System.out.println(lastName + " is yelling");
    }

}
        class MathTeacher extends Teacher {

            void teachMath() {
                System.out.println("Beba is teaching math");
            }
                MathTeacher(String name, String lastName, int age){
                    super(name, lastName, age);
                }

        }

        class ChemistryTeacher extends Teacher {

                void doExperiments(){
                System.out.println("Pavlina makes experiments");
            }


            ChemistryTeacher(String name, String lastName, int age) {
                super(name, lastName, age);
            }
        }

        class PianoTeacher extends Teacher {

                void teachMusic(){
                System.out.println("Dzej teaches playing the piano");
            }

            PianoTeacher(String name, String lastName, int age) {
                super(name, lastName, age);
            }
        }


