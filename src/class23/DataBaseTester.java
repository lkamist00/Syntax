package class23;

public class DataBaseTester {

    public static void main(String[] args) {

        DataBase dataBase=new Oracle();
        dataBase.openDataBase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDataBase();

    }

}
