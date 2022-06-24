package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.PageBase;

public class Google extends PageBase {
    public Google(WebDriver driver){super(driver);}
    By search = By.name("q");
    By btnSearch = By.name("btnK");

    public void ingresarTexto() throws Exception {
        this.texto(search,"Youtube");
    }

    public void clickBuscar() throws Exception {
        this.click(btnSearch);
    }
}
