package glue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private static WebDriver driver;
    private static WebDriverManager wdm;
    @Before
    public void setUp(){
        wdm = WebDriverManager.chromedriver().browserInDocker();
//        driver = new ChromeDriver();
        driver = wdm.create();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
//        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        wdm.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
