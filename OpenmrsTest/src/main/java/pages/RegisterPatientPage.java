package pages;

import org.openqa.selenium.*;

public class RegisterPatientPage {
    private WebDriver driver;
    protected HomePage homePage;
    private By lbError = By.className("field-error");
    private By tfGivenName = By.name("givenName");
    private By tfMiddleName = By.name("middleName");
    private By tfFamilyName = By.name("familyName");
    private By chbUnidentifiedPatient = By.xpath("//*[@id=\"checkbox-unknown-patient\"]");
    private By cbMaleGender = By.xpath("//*[@id=\"gender-field\"]/option[1]");
    private By cbFemaleGender = By.xpath("//*[@id=\"gender-field\"]/option[2]");
    private By tfDay = By.xpath("//*[@id=\"birthdateDay-field\"]");
    private By cbMonth = By.xpath("//*[@id=\"birthdateMonth-field\"]");
    private By tfYear = By.xpath("//*[@id=\"birthdateYear-field\"]");
    private By tfEstimatedYear = By.xpath("//*[@id=\"birthdateYears-field\"]");
    private By tfEstimatedMonth = By.xpath("//*[@id=\"birthdateMonths-field\"]");
    private By tfAddress1 = By.xpath("//*[@id=\"address1\"]");
    private By tfAddress2 = By.xpath("//*[@id=\"address2\"]");
    private By tfCityVillage = By.xpath("//*[@id=\"cityVillage\"]");
    private By tfStateProvince = By.xpath("//*[@id=\"stateProvince\"]");
    private By tfCountry = By.xpath("//*[@id=\"country\"]");
    private By tfPostalCode = By.xpath("//*[@id=\"postalCode\"]");
    private By tfPhone = By.name("phoneNumber");
    //*[@id="relationship_type"]

    private By btnNext = By.xpath("//*[@id=\"next-button\"]");
    private By btnBack = By.xpath("//*[@id=\"prev-button\"]");

    public RegisterPatientPage(WebDriver driver) {
        homePage = new HomePage(driver);
        homePage.clickRegisterPatientButton();
        this.driver = driver;
    }

    public String getError() {
        String error = driver.findElement(lbError).getText();
        return error;
    }
    public void setTfNameGiven(String nameGiven) {
        driver.findElement(tfGivenName).sendKeys(nameGiven);
    }
    public void setTfNameMiddle(String nameMiddle) {
        driver.findElement(tfMiddleName).sendKeys(nameMiddle);
    }
    public void setTfFamilyName(String familyName) {
        driver.findElement(tfFamilyName).sendKeys(familyName);
    }
    public void clickUnidentifiedPatient() {
        driver.findElement(chbUnidentifiedPatient).click();
    }
    public void clickMaleGenderButton() {
        driver.findElement(cbMaleGender).click();
    }
    public void clickFemaleGenderButton() {
        driver.findElement(cbFemaleGender).click();
    }
    public void setDay(String day) {
        driver.findElement(tfDay).sendKeys(day);
    }
    public void setMonth(int month) {
        driver.findElement(cbMonth).click();
        while (month!=0) {
            driver.findElement(cbMonth).sendKeys(Keys.ARROW_DOWN);
            month--;
        }
    }
    public void setYear(String year) {
        driver.findElement(tfYear).sendKeys(year);
    }
    public void setYears(String years) {
        driver.findElement(tfYear).sendKeys(years);
    }
    public void setMonths(String months) {
        driver.findElement(tfYear).sendKeys(months);
    }
    public void setTfAddress1(String address1) {
        driver.findElement(tfAddress1).sendKeys(address1);
    }
    public void setTfAddress2(String address2) {
        driver.findElement(tfAddress2).sendKeys(address2);
    }
    public void settfCityVillage(String cityVillage) {
        driver.findElement(tfCityVillage).sendKeys(cityVillage);
    }
    public void settfStateProvince(String stateProvince) {
        driver.findElement(tfStateProvince).sendKeys(stateProvince);
    }
    public void setTfCountry(String country) {
        driver.findElement(tfCountry).sendKeys(country);
    }
    public void setTfPostalCode(String postalCode) {
        driver.findElement(tfPostalCode).sendKeys(postalCode);
    }
    public void setTfPhone(String phone) {
        driver.findElement(tfPhone).sendKeys(phone);
    }
    public void clickNextButton() {
        driver.findElement(btnNext).click();
    }
    public void clickBackButton() {
        driver.findElement(btnBack).click();
    }
}