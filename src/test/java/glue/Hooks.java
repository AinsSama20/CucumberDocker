package glue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static WebDriver driver;
    WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker().remoteAddress("http://23.21.232.222/");
    @Before
    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver = wdm.create();
        driver.get("https://www.google.com/");
//        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        wdm.quit();
//        if (driver != null) {
//            driver.quit();
//        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
