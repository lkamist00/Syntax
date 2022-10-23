package class22;

public class WebDriverTester {

    public static void main(String[] args) {

        /*Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();

        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();

        Firefox Firefox=new Firefox();
        Firefox.startBrowser();
        Firefox.test();
        Firefox.closeBrowser();
        */



        WebDriver[] browsers={new Chrome(),new Firefox(), new Safari()};

        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }                                   //----> Polymorphism and upcasting


        for (int i = 0; i < browsers.length; i++) {
            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();
        }


        //Creating objects of all child classes and storing them in an array of type
        //WebDriver, we can do this with upcasting

        /*Chrome chrome=new Chrome();
        Firefox firefox=new Firefox();
        Safari safari=new Safari();
        WebDriver[] browsers={chrome, firefox, safari};
        */
    }

}
