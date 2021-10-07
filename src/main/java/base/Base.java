package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.testng.annotations.AfterSuite;


import javax.mail.Folder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

public class Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public void beforeMethod() throws InterruptedException {

        /*Bu method login ol ve client olarak  */
        System.setProperty("webdriver.chrome.driver", "/var/jenkins_home/driver/version94/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-setuid-sandbox");
        options.addArguments("--remote-debugging-port=9222");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("user-data-dir=/var/jenkins_home/driver/tmp/");
        options.addArguments("headless");

        driver = new ChromeDriver(options);
        // options.addArguments("user-data-dir=/var/jenkins_home/driver/tmp/");

        wait = new WebDriverWait(driver, 1000);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://360.evreka.co/login/");
//        driver.manage().window().maximize();
        driver.findElement(By.id("id_username")).sendKeys("qa-dogukan");
        driver.findElement(By.id("id_password")).sendKeys("!Q2w3e4r");
//        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[2]/button")).click();/*click on the log-in button*/
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[@role='button']")).click();
        /*Select selectClient = new Select(driver.findElement(By.id("client_select_dropdown")));
        Thread.sleep(2000);
        selectClient.selectByVisibleText("BOOST CAMP:38");*/
        driver.findElement(By.xpath("/html/body/div/header/nav/div[1]/a")).click();
        Thread.sleep(2000);
    }

    protected void waitUntilClickableByElement(WebElement element) {

        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement waitUntilVisibleByLocator(By locator) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void afterMethod() {
        driver.quit();
    }

//    public void afterSuite() throws InterruptedException {
//
//        try {
//            SendMail.sendMail();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }

//    public void afterClass() throws InterruptedException {
//
//        Thread.sleep(5000);
//
//    }
//    public void afterSuite(){
//        try {
//            SendMail.sendMail();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}

