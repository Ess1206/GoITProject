package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Stan on 25.07.2016.
 */
public class BrowserFactory extends FactoryMethods{

    @BeforeTest
    public void setUP(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        DRIVER.set(driver);
    }

    @AfterTest
    public void quitBrowser(){
        driver().close();
        driver().quit();
    }

}