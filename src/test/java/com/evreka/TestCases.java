package com.evreka;

import base.Base;
import component.AssetManagementPage;
import component.DashboardPage;
import component.LoginPage;
import component.ResourceManagementPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestCases extends Base {
    String newRegionName = "";
    String newDeviceName = "";
    String newDevicDeviceName = "";


    @BeforeTest
    public void beforeMethod() throws InterruptedException {
        super.beforeMethod();
    }

    @Test(priority = 1)
    void verifyLogin() throws InterruptedException {
//        try {
//            Files.delete(Path.of("/Users/dogukanmermutlu/IdeaProjects/EvrekaProd/test-output/emailable-report.html"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            DashboardPage dashboardPage = new DashboardPage(driver);
            dashboardPage.findLogOutButton().isSelected();
        } catch (Exception e) {
            e.printStackTrace();
        }
        afterMethod();

    }

    @Test(priority = 2)
    void verifyLogout() throws InterruptedException {
        beforeMethod();
        try {
            DashboardPage dashboardPage = new DashboardPage(driver);
            LoginPage loginPage = new LoginPage(driver);
            Thread.sleep(5000);
            dashboardPage.findLogOutButton().click();
            Thread.sleep(4000);
            loginPage.findLoginButton().isSelected();
        } catch (Exception e) {
            e.printStackTrace();
        }
        afterMethod();
    }

    @Test(priority = 3)
    @Parameters({"regionName"})
    void addNewRegion(String newRegionName) throws InterruptedException {
        beforeMethod();
        this.newRegionName = newRegionName;
        try {
            DashboardPage dashboardPage = new DashboardPage(driver);
            ResourceManagementPage resourceManagementPage = new ResourceManagementPage(driver);
            Thread.sleep(5000);
            dashboardPage.findResourceManagementTab().click(); /*click on the resource management tab*/
            Thread.sleep(5000);
            resourceManagementPage.findAddNewRegionButton().click(); /*click on the add new region button*/
            Thread.sleep(5000);
            resourceManagementPage.findNewRegionNameField().sendKeys(newRegionName); /*fill the region name*/
            Thread.sleep(2000);
            resourceManagementPage.findAddNewRegionQA2Operation().click(); /*select the QA Operation 2 as operation*/
            Thread.sleep(2000);
            resourceManagementPage.findNewRegionSaveButton().click(); /*click on the save button*/
            Thread.sleep(5000);
            boolean displayError = resourceManagementPage.findError().isDisplayed();
            String message = resourceManagementPage.findErrorMessage().getText();

            if (displayError == true) {

                Assert.assertFalse(true, message);
            }

            /*The next steps are to check the added value*/
            resourceManagementPage.findSearchBarRegionName().sendKeys(newRegionName);
            Thread.sleep(5000);
            String actualRegionName = resourceManagementPage.findSearcedRegionName().getText();
            String expectedRegionName = newRegionName;
            Assert.assertEquals(actualRegionName, expectedRegionName);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        afterMethod();


    }

    @Test(priority = 4)
    @Parameters({"deviceId", "deviceName"})
    void addNewDevice(String deviceId, String deviceName) throws InterruptedException {
        beforeMethod();
        try {
            DashboardPage dashboardPage = new DashboardPage(driver);
            ResourceManagementPage resourceManagementPage = new ResourceManagementPage(driver);
            Thread.sleep(5000);
            dashboardPage.findResourceManagementTab().click();/*click on the resource management tab*/
            Thread.sleep(5000);
            resourceManagementPage.findAddNewDeviceButton().click();/*click on the add new device button*/
            Thread.sleep(5000);
            resourceManagementPage.findAddNewDeviceId().sendKeys(deviceId); /*fill the device id*/
            resourceManagementPage.findAddNewDeviceName().sendKeys(deviceName);/*fill the device name*/
            Select selectType = new Select(resourceManagementPage.findAddNewDeviceTypeCombobox());
            selectType.selectByIndex(1); /*select device type */
            Thread.sleep(5000);
            Select selectClient = new Select(resourceManagementPage.findAddNewDeviceClientCombobox());
            selectClient.selectByIndex(1); /*select device client*/
            Thread.sleep(5000);
            resourceManagementPage.findAddNewDeviceSaveButton().click(); /*click on the save button*/
            Thread.sleep(5000);
            boolean displayError = resourceManagementPage.findError().isDisplayed();
            String message = resourceManagementPage.findErrorMessage().getText();

            if (displayError == true) {

                Assert.assertFalse(true, message);
            }

            /*The next steps are to check the added value*/
            resourceManagementPage.findSearchBarDeviceName().sendKeys(deviceName);
            Thread.sleep(2000);
            String actualDeviceName = resourceManagementPage.findSearchedDeviceName().getText();
            Thread.sleep(2000);
            String expectedDeviceName = deviceName;
            Assert.assertEquals(actualDeviceName, expectedDeviceName);
            this.newDeviceName = deviceName;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        afterMethod();

    }

    @Test(priority = 5)
    @Parameters({"vehicleId", "vehiclePlate"})
    void addNewVehicle(Integer newVehicleId, String newVehiclePlate) throws InterruptedException {
        beforeMethod();
        try {
            DashboardPage dashboardPage = new DashboardPage(driver);
            ResourceManagementPage resourceManagementPage = new ResourceManagementPage(driver);
            Thread.sleep(5000);
            dashboardPage.findResourceManagementTab().click();/*Click on the resouurce management tab*/
            Thread.sleep(5000);
            resourceManagementPage.findAddNewVehicleButton().click();/*click on the add new vehicle button*/
            Thread.sleep(5000);
            resourceManagementPage.findAddNewVehicleIdField().sendKeys(String.valueOf(newVehicleId));/*fill the vehicle id*/
            resourceManagementPage.findAddNewVehiclePlateField().sendKeys(newVehiclePlate);/*fill the vehicle plate*/
            Thread.sleep(5000);

            Select selectClient = new Select(resourceManagementPage.findAddNewVehicleClientCombobox());
            selectClient.selectByIndex(1);

            Select selectTablet = new Select(resourceManagementPage.findAddNewVehicleTabletCombobox());
            selectTablet.selectByVisibleText(newDeviceName);
            Thread.sleep(3000);

            Select selectDataSource = new Select(resourceManagementPage.findAddNewVehicleDataSourceCombobox());
            selectDataSource.selectByIndex(2);
            Thread.sleep(3000);
            resourceManagementPage.findAddNewVehicleGeneralWasteOperation().click();
            resourceManagementPage.findAddNewVehicleSaveButton().click();
            Thread.sleep(3000);

            boolean displayError = resourceManagementPage.findError().isDisplayed();
            String message = resourceManagementPage.findErrorMessage().getText();
            if (displayError == true) {
                Assert.assertFalse(true, message);
            }

            /*The next steps are to check the added value*/
            resourceManagementPage.findSearchBarVehicles().sendKeys(newVehiclePlate);
            Thread.sleep(2000);
            String actualVehiclePlate = resourceManagementPage.findSearchedVehiclePlate().getText();
            String expectedVehiclePlate = newVehiclePlate;
            Assert.assertEquals(actualVehiclePlate, expectedVehiclePlate);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        afterMethod();
    }

    @Test(priority = 6)
    @Parameters({"employeeId", "employeeName", "employeeCode", "employeePhoneNumber"})
    void addNewEmployee(Integer employeeId, String employeeName, Integer employeeCode, String employeePhoneNumber) throws InterruptedException {
        beforeMethod();
        try {
            DashboardPage dashboardPage = new DashboardPage(driver);
            ResourceManagementPage resourceManagementPage = new ResourceManagementPage(driver);
            Thread.sleep(5000);
            dashboardPage.findResourceManagementTab().click(); /*click on the resource management tab */
            Thread.sleep(2000);
            resourceManagementPage.findAddNewEmployeeButton().click(); /*click on the add new employee button*/
            Thread.sleep(2000);
            Select selectEmployeeType = new Select(resourceManagementPage.findAddNewEmployeeTypeCombobox());
            Thread.sleep(2000);
            selectEmployeeType.selectByIndex(1); /*Select crew member as type*/
            resourceManagementPage.findAddNewEmployeeIdField().sendKeys(String.valueOf(employeeId));
            resourceManagementPage.findAddNewEmployeeNameField().sendKeys(employeeName);
            resourceManagementPage.findAddNewEmployeeCodeField().sendKeys(String.valueOf(employeeCode));
            Thread.sleep(2000);
            Select selectEmployeeTable = new Select(resourceManagementPage.findAddNewEmployeeTabletCombobox());
            Thread.sleep(2000);
            selectEmployeeTable.selectByVisibleText(newDeviceName);
            Thread.sleep(2000);
            Select selectEmployeeDataSource = new Select(resourceManagementPage.findAddNewEmployeeDataSourceCombobox());
            Thread.sleep(2000);
            selectEmployeeDataSource.selectByIndex(1); /*select by tablet as data source*/
            Thread.sleep(2000);
            resourceManagementPage.findAddNewEmployeeGeneralWasteOperation().click(); /*select by general waste operation as operation*/
            Thread.sleep(2000);
            resourceManagementPage.findAddNewEmployeePhoneNumberField().sendKeys(employeePhoneNumber);
            Thread.sleep(2000);
            resourceManagementPage.findAddNewEmployeeSaveButton().click();
            Thread.sleep(2000);

            boolean displayError = resourceManagementPage.findError().isDisplayed();
            String message = resourceManagementPage.findErrorMessage().getText();
            if (displayError == true) {
                Assert.assertFalse(true, message);
            }

            /*The next steps are to check the added value*/
            resourceManagementPage.findSearchBarEmployeeName().sendKeys(employeeName);
            Thread.sleep(2000);
            String actualEmployeeName = resourceManagementPage.findSearcedEmployeeName().getText();
            Thread.sleep(2000);
            String expectedEmployeeName = employeeName;
            Assert.assertEquals(actualEmployeeName, expectedEmployeeName);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test(priority = 7)
    @Parameters({"shiftName", "eStartTime", "lStartTime", "length"})
    void addNewShift(String shiftName, String eStartTime, String lStartTime, Integer length) throws InterruptedException {
        beforeMethod();

        try {
            DashboardPage dashboardPage = new DashboardPage(driver);
            ResourceManagementPage resourceManagementPage = new ResourceManagementPage(driver);
            Thread.sleep(5000);
            dashboardPage.findResourceManagementTab().click();
            Thread.sleep(3000);
            resourceManagementPage.findAddNewShiftButton().click();
            Thread.sleep(3000);
            resourceManagementPage.findAddNewShiftNameField().sendKeys(shiftName);
            resourceManagementPage.findAddNewShiftEStartTimeField().sendKeys(eStartTime);
            resourceManagementPage.findAddNewShiftLStartTimeField().sendKeys(lStartTime);
            resourceManagementPage.findAddNewShiftLengthField().sendKeys(String.valueOf(length));
            resourceManagementPage.findAddNewShiftSaveButton().click();
            Thread.sleep(5000);

            boolean displayError = resourceManagementPage.findError().isDisplayed();
            String message = resourceManagementPage.findErrorMessage().getText();
            if (displayError == true) {
                Assert.assertFalse(true, message);
            }

            /*The next steps are to check the added value*/
            resourceManagementPage.findSearchBarShiftName().sendKeys(shiftName);
            Thread.sleep(2000);
            String actualshiftName = resourceManagementPage.findSearchedShiftName().getText();
            Thread.sleep(2000);
            String expectedshiftName = shiftName;
            Assert.assertEquals(actualshiftName, expectedshiftName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        afterMethod();

    }

    @Test(priority = 8)
    @Parameters({"assetName", "tagUid", "brandField", "atikTipiField"})
    void addAsset(String assetName, String tagUid, String brandField, String atikTipiField) throws InterruptedException {
        beforeMethod();
        try {
            DashboardPage dashboardPage = new DashboardPage(driver);
            ResourceManagementPage resourceManagementPage = new ResourceManagementPage(driver);
            AssetManagementPage assetManagementPage = new AssetManagementPage(driver);
            Thread.sleep(5000);
            dashboardPage.findAssetManagementTab().click();
            Thread.sleep(5000);
            assetManagementPage.findAddAssetButton().click();
            Thread.sleep(5000);
            assetManagementPage.findAddAssetNameField().sendKeys(assetName);
            assetManagementPage.findAddAssetTagUidField().sendKeys(tagUid);
            assetManagementPage.findAddAssetLocationField().click();
            assetManagementPage.selectionToMap().click();
            assetManagementPage.findAddAssetTypeCombobox().click();
            Thread.sleep(2000);
            Actions down = new Actions(driver);
            down.sendKeys(Keys.chord(Keys.ENTER)).perform();
            Thread.sleep(3000);
            /*assetManagementPage.findAddAssetBrandField().sendKeys(brandField);*/
            assetManagementPage.findAddAssetAtikTipiField().sendKeys(atikTipiField);
            Thread.sleep(2000);
            assetManagementPage.findAddAssetSubmitButton().click();
            Thread.sleep(2000);
            /*The next steps are to check the added value*/
            assetManagementPage.findSearchBarAssetName().sendKeys(assetName);
            Thread.sleep(2000);
            String actualassetName = assetManagementPage.findSearchedAssetName().getText();
            String expectedassetName = assetName;
            Thread.sleep(10000);
            Assert.assertEquals(actualassetName, expectedassetName);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

//    (timeOut = 10000)
//    void mail()  {
//        try {
//            SendMail.sendMail();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @AfterClass()
    public void afterClass() throws InterruptedException {
//        try {
//            SendMail.sendMail();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        super.afterClass();
//
//        }
//    @AfterSuite()
//    public void afterSuite throws InterruptedException{
//        super.afterSuite();
//
//    }

//    SendMail tempa = new SendMail();
//    tempa.sendMail();

    }
}
