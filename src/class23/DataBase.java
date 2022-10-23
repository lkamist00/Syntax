package class23;

public abstract class DataBase {

    abstract void openDataBase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDataBase();

}

class MicrosoftDataBase extends DataBase{

    @Override
    void openDataBase() {
        System.out.println("Opening the Microsoft Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from MSDataBase");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data to MSDataBase");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing the MSDataBase");
    }
}

class Oracle extends DataBase{


    @Override
    void openDataBase() {
        System.out.println("Opening the Oracle DataBase");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Oracle DataBase");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data to Oracle DataBase");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing the Oracle DataBase");
    }
}

