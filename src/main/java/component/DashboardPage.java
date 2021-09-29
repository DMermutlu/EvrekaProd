package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public WebElement findLogOutButton() {
        By logoutButton = By.xpath("//span[normalize-space()='Log Out']");
        return driver.findElement(logoutButton);
    }

    public WebElement findResourceManagementTab() {
        By resourceManagementTab = By.xpath("//span[normalize-space()='Resource Management']");
        return driver.findElement(resourceManagementTab);
    }

    public WebElement findAssetManagementTab() {
        By assetManagementTab = By.xpath("//span[normalize-space()='Asset Management']");
        return driver.findElement(assetManagementTab);
    }
}
