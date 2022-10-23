package class23;

public interface IDataBase {

    //interface classes and methods are abstract by default
    //methods cannot have body
    //cant have instance variables, they are public, static, final by default

    void openDataBase();
    void readData();
    void writeData();
    void closeDataBase();

}

class IBM implements IDataBase{


    @Override
    public void openDataBase() {

    }

    @Override
    public void readData() {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void closeDataBase() {

    }
}
