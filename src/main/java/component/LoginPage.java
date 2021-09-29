package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage (WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(this.driver,this);
        }
    public WebElement findLoginButton(){
            By loginButton = By.xpath("/html/body/div[1]/div/form/div[3]/div[2]/button");
            return driver.findElement(loginButton);
        }
}
