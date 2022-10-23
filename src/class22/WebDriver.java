package class22;

public class WebDriver {

    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void test(){
        System.out.println("Perform testing");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}

class Chrome extends WebDriver{

    public void startBrowser(){
        System.out.println("Starting Google Chrome");
    }

    public void test(){
        System.out.println("Perform testing on Google Chrome");
    }

    public void closeBrowser(){
        System.out.println("Closing Google Chrome");
    }

}

class  Firefox extends WebDriver{

    public void startBrowser(){
        System.out.println("Starting Firefox");
    }

    public void test(){
        System.out.println("Perform testing on Firefox");
    }

    public void closeBrowser(){
        System.out.println("Closing Firefox");
    }

}

class Safari extends WebDriver{

    public void startBrowser(){
        System.out.println("Starting Safari");
    }

    public void test(){
        System.out.println("Perform testing on Safari");
    }

    public void closeBrowser(){
        System.out.println("Closing Safari");
    }

}

