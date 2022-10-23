package class22;

public class FinalDemo {

    public static void main(String[] args) {
        Phone phone=new Phone();
        //phone.RAM=50;

    }

}

final class Phone{          //it means the value its final, you can access it but cant redeclared/inherit/ it anywhere else

    final int RAM=512;      //it means the value its final, you can access it but cant redeclared/inherit/ it anywhere else

    final void takePics(){  //it means the value its final, you can access it but cant redeclared/inherit/ it anywhere else

    }

}

//class Iphone extends Phone{

//  void takePics(){

//  }


