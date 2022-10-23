package homework.class20;

public class userClass {

    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */

    String name;
    String mobileNumber;

    public userClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

}

class userInfo extends userClass{

    String userAddress;

    userInfo(String name, String mobileNumber, String userAddress){
        super(name, mobileNumber);
        this.userAddress=userAddress;
    }

    void userDetails() {
        System.out.println(name + " " + mobileNumber + " " + userAddress);
    }
}

class Tester{
    public static void main(String[] args) {

        userInfo user=new userInfo("Tupan", "5618014630","123 Main street");
        user.userDetails();

    }
}






