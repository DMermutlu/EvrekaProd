package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AssetManagementPage {

    WebDriver driver;

    public AssetManagementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public WebElement findAddAssetButton() {
        By addAssetButton = By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div/div/div[1]/div[2]/div/div[1]/div[1]/button");
        return driver.findElement(addAssetButton);
    }

    public WebElement findAddAssetNameField() {
        By addAssetNameField = By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div/div/div/div[1]/div/form/div/div[1]/div[1]/input");
        return driver.findElement(addAssetNameField);
    }

    public WebElement findAddAssetTagUidField() {
        By addAssetTagUidField = By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div/div[1]/div/form/div/div[2]/div[1]/input");
        return driver.findElement(addAssetTagUidField);
    }

    public WebElement findAddAssetLocationField() {
        By addAssetLocationField = By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div/div[1]/div/form/div/div[3]/div[1]/input");
        return driver.findElement(addAssetLocationField);
    }

    public WebElement selectionToMap() {
        By selectionToMap = By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div/div[2]/div/div[2]/div");
        return driver.findElement(selectionToMap);
    }

    public WebElement findAddAssetTypeCombobox() {
        By addAssetTypeCombobox = By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div/div[1]/div/form/div/div[4]/div/div/div[1]");
        return driver.findElement(addAssetTypeCombobox);
    }

    public WebElement findAddAssetBrandField() {
        By addAssetBrandField = By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div/div/div/div[1]/div/form/div/div[5]/div/div[1]/div[1]/input");
        return driver.findElement(addAssetBrandField);
    }

    public WebElement findAddAssetAtikKoduField() {
        By addAssetAtikKoduField = By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div/div[1]/div/form/div/div[5]/div/div[2]/div/input");
        return driver.findElement(addAssetAtikKoduField);
    }

    public WebElement findAddAssetAtikTipiField() {
        By addAssetAtikTipiField = By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div/div[1]/div/form/div/div[5]/div/div/div[1]/input");
        return driver.findElement(addAssetAtikTipiField);
    }

    public WebElement findAddAssetSubmitButton() {
        By addAssetSubmitButton = By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div/div[1]/div/form/div/div[7]/div/div/div[2]/button/div");
        return driver.findElement(addAssetSubmitButton);
    }

    public WebElement findSearchBarAssetName() {
        By searchBarAssetName = By.xpath("//th[2]//div[2]//input[1]");
        return driver.findElement(searchBarAssetName);
    }

    public WebElement findSearchedAssetName() {
        By searchedAssetName = By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div/div/div[1]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]");
        return driver.findElement(searchedAssetName);
    }


}
