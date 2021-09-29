package component;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ResourceManagementPage {

    WebDriver driver;

    public ResourceManagementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public WebElement findAddNewRegionButton() {
        By addNewRegionButton = By.xpath("/html/body/div[1]/div[1]/section/div[1]/div/div[4]/div/div/div[2]/div[2]/div[1]/a");
        return driver.findElement(addNewRegionButton);
    }

    public WebElement findNewRegionNameField() {
        By newRegioNameField = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]");
        return driver.findElement(newRegioNameField);

    }

    public WebElement findAddNewRegionQA2Operation() {
        By addNewRegionQA2Operation = By.xpath("//select[@ng-model='region.operations']//option[@value='number:13'][normalize-space()='QA Operation 2']");
        return driver.findElement(addNewRegionQA2Operation);//*[@id="add-region-modal"]/div/div/div[2]/form/div[2]/select/option[1]
    }

    public WebElement findNewRegionSaveButton() {
        By addNewRegionSaveButton = By.xpath("//button[@ng-click='addRegion(region, regionForm)']");
        return driver.findElement(addNewRegionSaveButton);
        /*//button[@ng-click='addRegion(region, regionForm)']
        //*[@id="add-region-modal"]/div/div/div[3]/button[2]
        /html/body/div[1]/div[1]/section/div[1]/div/div[4]/div/div/div[2]/div[3]/div/div/div[3]/button[2]*/
    }

    public WebElement findSearchBarRegionName() {
        By searchBarRegionName = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/th[1]/input[1]");
        return driver.findElement(searchBarRegionName);
    }

    public WebElement findSearcedRegionName() {
        By searchedRegionName = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/span[2]");
        return driver.findElement(searchedRegionName);
    }

    public WebElement findError() {
        By error = By.xpath("//*[@id=\"error_modal\"]/div/div/div[1]/h4");
        return driver.findElement(error);
    }

    public WebElement findErrorMessage() {
        By errorMessage = By.xpath("//*[@id=\"error_modal\"]/div/div/div[2]");
        return driver.findElement(errorMessage);
    }

    public WebElement findAddNewDeviceButton() {
        By addNewDeviceButton = By.xpath("/html/body/div[1]/div[1]/section/div[1]/div/div[3]/div/div/div[2]/div[2]/div[1]/a[1]");
        return driver.findElement(addNewDeviceButton);
    }

    public WebElement findAddNewDeviceId() {
        By addNewDeviceId = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]");
        return driver.findElement(addNewDeviceId);
    }

    public WebElement findAddNewDeviceName() {
        By addNewDeviceName = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]");
        return driver.findElement(addNewDeviceName);
    }

    public WebElement findAddNewDeviceTypeCombobox() {
        By addNewDeviceTypeCombobox = By.xpath("//*[@id=\"add-device-modal\"]/div/div/div[2]/form/div[3]/select");
        return driver.findElement(addNewDeviceTypeCombobox);

    }

    public WebElement findAddNewDeviceClientCombobox() {
        By addNewDeviceClientCombobox = By.xpath("//*[@id=\"add-device-modal\"]/div/div/div[2]/form/div[4]/select");
        return driver.findElement(addNewDeviceClientCombobox);
    }

    public WebElement findAddNewDeviceSaveButton() {
        By addNewDeviceSaveButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/button[2]");
        return driver.findElement(addNewDeviceSaveButton);
    }

    public WebElement findSearchBarDeviceName() {
        By searchBarDeviceName = By.xpath("//*[@id=\"devices_table\"]/tbody/tr[1]/th[2]/input");
        return driver.findElement(searchBarDeviceName);
    }

    public WebElement findSearchedDeviceName() {
        By searchedDeviceName = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/span[1]");
        return driver.findElement(searchedDeviceName);

    }

    public WebElement findAddNewVehicleButton() {
        By addNewVehicleButton = By.xpath("/html/body/div[1]/div[1]/section/div[1]/div/div[2]/div/div/div[2]/div[2]/div[1]/a");
        return driver.findElement(addNewVehicleButton);
    }

    public WebElement findAddNewVehicleIdField() {
        By newVehicleIdField = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]");
        return driver.findElement(newVehicleIdField);
    }

    public WebElement findAddNewVehiclePlateField() {
        By newVehiclePlateField = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]");
        return driver.findElement(newVehiclePlateField);
    }

    public WebElement findAddNewVehicleClientCombobox() {
        By vehicleClientCombobox = By.id("vehicle_client");
        return driver.findElement(vehicleClientCombobox);
    }

    public WebElement findAddNewVehicleTabletCombobox() {
        By vehicleTabletCombobox = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[4]/select[1]");
        return driver.findElement(vehicleTabletCombobox);
    }

    public WebElement findAddNewVehicleDataSourceCombobox() {
        By newVehicleDataSourceCombobox = By.xpath("//*[@id=\"add-vehicle-modal\"]/div/div/div[2]/form/div[5]/select");
        return driver.findElement(newVehicleDataSourceCombobox);
    }

    public WebElement findAddNewVehicleGeneralWasteOperation() {
        By addNewVehicleGeneralWasteOperation = By.xpath("//*[@id=\"add-vehicle-modal\"]/div/div/div[2]/form/div[6]/select/option[1]");
        return driver.findElement(addNewVehicleGeneralWasteOperation);
    }

    public WebElement findAddNewVehicleSaveButton() {
        By addNewVehicleSaveButton = By.xpath("//*[@id=\"add-vehicle-modal\"]/div/div/div[3]/button[2]");
        return driver.findElement(addNewVehicleSaveButton);
    }

    public WebElement findSearchBarVehicles() {
        By searchBarVehicles = By.xpath("/html/body/div/div[1]/section/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/th[2]/input");
        return driver.findElement(searchBarVehicles);

    }

    public WebElement findSearchedVehiclePlate() {
        By searchedVehiclePlate = By.xpath("/html/body/div/div[1]/section/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[2]/span");
        return driver.findElement(searchedVehiclePlate);
    }

    public WebElement findAddNewEmployeeButton() {
        By addNewEmployeeButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]");
        return driver.findElement(addNewEmployeeButton);
    }

    public WebElement findAddNewEmployeeTypeCombobox() {
        By addNewEmployeeTypeCombobox = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/select[1]");
        return driver.findElement(addNewEmployeeTypeCombobox);
    }

    public WebElement findAddNewEmployeeIdField() {
        By addNewEmployeeIdField = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]");
        return driver.findElement(addNewEmployeeIdField);
    }

    public WebElement findAddNewEmployeeNameField() {
        By addNewEmployeeNameField = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]");
        return driver.findElement(addNewEmployeeNameField);
    }

    public WebElement findAddNewEmployeeCodeField() {
        By addNewEmployeeCodeField = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[4]/input[1]");
        return driver.findElement(addNewEmployeeCodeField);
    }

    public WebElement findAddNewEmployeeTabletCombobox() {
        By addNewEmployeeTabletCombobox = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[8]/select[1]");
        return driver.findElement(addNewEmployeeTabletCombobox);
    }

    public WebElement findAddNewEmployeeDataSourceCombobox() {
        By addNewEmployeeDataSourceCombobox = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[9]/select[1]");
        return driver.findElement(addNewEmployeeDataSourceCombobox);
    }

    public WebElement findAddNewEmployeeGeneralWasteOperation() {
        By addNewEmployeeGeneralWasteOperation = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[10]/select[1]/option[2]");
        return driver.findElement(addNewEmployeeGeneralWasteOperation);
    }

    public WebElement findAddNewEmployeePhoneNumberField() {
        By addNewEmployeePhoneNumberField = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[11]/input[1]");
        return driver.findElement(addNewEmployeePhoneNumberField);
    }

    public WebElement findAddNewEmployeeSaveButton() {
        By addNewEmployeeSaveButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/button[2]");
        return driver.findElement(addNewEmployeeSaveButton);
    }

    public WebElement findSearchBarEmployeeName() {
        By searchBarEmployeeName = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/th[2]/input[1]");
        return driver.findElement(searchBarEmployeeName);
    }

    public WebElement findSearcedEmployeeName() {
        By searchedEmployeeName = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/span[1]");
        return driver.findElement(searchedEmployeeName);
    }

    public WebElement findAddNewShiftButton() {
        By addNewShiftButton = By.xpath("//a[normalize-space()='+ Add New Shift']");
        return driver.findElement(addNewShiftButton);
    }

    public WebElement findAddNewShiftNameField() {
        By addNewShiftNameField = By.xpath("//input[@name='shift_name']");
        return driver.findElement(addNewShiftNameField);
    }

    public WebElement findAddNewShiftEStartTimeField() {
        By addNewShiftEStartTimeField = By.xpath("//input[@id='shift_start_time']");
        return driver.findElement(addNewShiftEStartTimeField);
    }

    public WebElement findAddNewShiftLStartTimeField() {
        By addNewShiftLStartTimeField = By.xpath("//input[@id='shift_end_time']");
        return driver.findElement(addNewShiftLStartTimeField);
    }

    public WebElement findAddNewShiftLengthField() {
        By addNewShiftLengthField = By.xpath("//input[@id='shift_length']");
        return driver.findElement(addNewShiftLengthField);
    }

    public WebElement findAddNewShiftSaveButton() {
        By addNewShiftSaveButton = By.xpath("//button[@ng-click='addShift(shift, shiftForm)']");
        return driver.findElement(addNewShiftSaveButton);
    }

    public WebElement findSearchBarShiftName() {
        By searchBarShiftName = By.xpath("//*[@id=\"shift_table\"]/tbody/tr[1]/th[2]/input");
        return driver.findElement(searchBarShiftName);
    }

    public WebElement findSearchedShiftName() {
        By searchedShiftName = By.xpath("/html/body/div[1]/div[1]/section/div[1]/div/div[6]/div/div/div[2]/table/tbody/tr[2]/td[2]");
        return driver.findElement(searchedShiftName);
    }

}
