package homework.class22;

public class StudentTester {

    public static void main(String[] args) {

        //Student student=new SyntaxStudent();

        Student [] arr={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student st :arr) {
            st.doHomeWork();
            st.doPractice();
            st.study();
        }

    }

}
