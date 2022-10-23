package class14;

public class MethodsDemo4 {

    boolean mystery(){
        return false;
    }

    String mystery2(int num){
        return "java";
    }

    String method(String word) {
        //return "java";
        if (word.equals("java")) {
            return "python";
        } else {
            return "java";
        }
    }
    public static void main(String[] args) {

        MethodsDemo4 methodsDemo4=new MethodsDemo4();
        System.out.println(methodsDemo4.mystery());
        System.out.println(methodsDemo4.mystery2(5));       // no loop it will return just once
        System.out.println(methodsDemo4.method("python"));


    }


}
