package core;

import org.openqa.selenium.WebDriver;

/**
 * Created by Stan on 25.07.2016.
 */
public class FactoryMethods {


    public static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<WebDriver>();
    public static WebDriver driver(){
        return DRIVER.get();
    }
    public WebDriver driver;

    public void get(String url){
        driver.get(url);
    }

/*

    public boolean waitForUrlContains(String text, int sec){
        for(int i = 0; i<=sec*10; i++){
            if(driver().getCurrentUrl().contains(text)) {
                return true;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
*/

}
