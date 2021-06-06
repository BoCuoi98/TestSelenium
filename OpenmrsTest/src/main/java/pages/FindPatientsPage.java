package pages;

import org.openqa.selenium.*;

public class FindPatientsPage {
    private WebDriver driver;
    protected HomePage homePage;
    private String xpathRecord = "//*[@id=\"patient-search-results-table\"]/tbody/tr";

    public FindPatientsPage(WebDriver driver) {
        homePage = new HomePage(driver);
        homePage.clickFindPatient();
        this.driver = driver;
    }

    public void clickRecord(String record) {
        int num = Integer.parseInt(record);
        driver.findElement(By.xpath(xpathRecord + "[" + num + "]")).click();
    }
}
