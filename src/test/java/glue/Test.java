package glue;

import org.openqa.selenium.WebDriver;
import pom.Pages.Google;

public class Test {
    protected WebDriver driver=Hooks.getDriver();
    protected Google google=new Google(driver);
}
