package tests;

import core.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.Test;

/**
 * Created by Stan on 25.07.2016.
 */
public class TestFW extends BrowserFactory{

    @Test
    public void mainTest() throws InterruptedException {
        driver.get("https://google.com");
        Thread.sleep(5000);

    }

}
