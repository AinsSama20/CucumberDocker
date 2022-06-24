package glue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class Hooks {
    private static WebDriver driver;
    WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker();
    @Before
    public void setUp(){
//        driver = new ChromeDriver();
        driver = wdm.create();
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
