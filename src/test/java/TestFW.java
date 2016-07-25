import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.Test;

/**
 * Created by Stan on 25.07.2016.
 */
public class TestFW {

    @Test
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("google.com");
        driver.close();
        driver.quit();

    }

}
