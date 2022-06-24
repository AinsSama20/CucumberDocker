package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {
    private WebDriver driver;
    public PageBase(WebDriver driver){this.driver=driver;}
    public void texto(By element,String argument) throws Exception {
        try{
            driver.findElement(element).sendKeys(argument);
            Thread.sleep(2000);
        }catch (Exception e){
            throw new Exception("Error");
        }
    }

    public void click(By element) throws Exception {
        try{
            driver.findElement(element).click();
            Thread.sleep(2000);
        }catch (Exception e){
            throw new Exception("Error");
        }
    }
}
