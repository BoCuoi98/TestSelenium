package pages;

import org.openqa.selenium.*;

import java.util.List;

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
    private By cbRelationshipType = By.xpath("//*[@id=\"relationship_type\"]");
    private By tfPersonName = By.xpath("//*[@id=\"relationship\"]/p[2]/input[1]");
    private By btnConfirm = By.xpath("//*[@id=\"submit\"]");

    private By btnNext = By.xpath("//*[@id=\"next-button\"]");
    private By btnBack = By.xpath("//*[@id=\"prev-button\"]");

    public RegisterPatientPage(WebDriver driver) {
        homePage = new HomePage(driver);
        homePage.clickRegisterPatientButton();
        this.driver = driver;
    }

    public String getError() {
//        String error = driver.findElement(lbError).getAttribute("Style");
        String err = "";
        List<WebElement> errors = driver.findElements(lbError);
        for (WebElement error:errors) {
            if (error.getAttribute("Style") == "") {
                err = error.getText();
                break;
            }
        }
        return err;
    }
    public void setNameGiven(String nameGiven) {
        driver.findElement(tfGivenName).sendKeys(nameGiven);
    }
    public void setNameMiddle(String nameMiddle) {
        driver.findElement(tfMiddleName).sendKeys(nameMiddle);
    }
    public void setFamilyName(String familyName) {
        driver.findElement(tfFamilyName).sendKeys(familyName);
    }
    public void clickUnidentifiedPatient() {
        driver.findElement(chbUnidentifiedPatient).click();
    }
    public void setGender(String gender) {
        if (gender.equals("Male")) {
            driver.findElement(cbMaleGender).click();
        } else if (gender.equals("Female")) {
            driver.findElement(cbFemaleGender).click();
        } else ;
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
    public void setAddress1(String address1) {
        driver.findElement(tfAddress1).sendKeys(address1);
    }
    public void setAddress2(String address2) {
        driver.findElement(tfAddress2).sendKeys(address2);
    }
    public void setCityVillage(String cityVillage) {
        driver.findElement(tfCityVillage).sendKeys(cityVillage);
    }
    public void setStateProvince(String stateProvince) {
        driver.findElement(tfStateProvince).sendKeys(stateProvince);
    }
    public void setCountry(String country) {
        driver.findElement(tfCountry).sendKeys(country);
    }
    public void setPostalCode(String postalCode) {
        driver.findElement(tfPostalCode).sendKeys(postalCode);
    }
    public void setPhone(String phone) {
        driver.findElement(tfPhone).sendKeys(phone);
    }
    public void setRelationshipType(String relationshipType) {
        driver.findElement(cbRelationshipType).click();
        int i;
        switch (relationshipType) {
            case "Doctor":
                i = 1;
                break;
            case "Sibling":
                i = 2;
                break;
            case "Parent":
                i = 3;
                break;
            case "Aunt/Uncle":
                i = 4;
                break;
            case "Supervisor":
                i = 5;
                break;
            case "Patient":
                i = 6;
                break;
            case "Child":
                i = 7;
                break;
            case "Niece/Nephew":
                i = 8;
                break;
            case "Supervisee":
                i = 9;
                break;
            default:
                i = 0;
                break;
        }
        while (i!=0) {
            driver.findElement(cbRelationshipType).sendKeys(Keys.ARROW_DOWN);
            i--;
        }
    }
    public void setPersonName(String personName) {
        driver.findElement(tfPersonName).sendKeys(personName);
    }
    public void clickNextButton() {
        driver.findElement(btnNext).click();
    }
    public void clickBackButton() {
        driver.findElement(btnBack).click();
    }
    public void clickConfirmButton() {
        driver.findElement(btnConfirm).click();
    }
}