package pages;

import org.openqa.selenium.*;
import pages.LoginPage;

public class HomePage {
    private WebDriver driver;
    protected LoginPage loginPage;
    private By btnLogout = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a");
    private By btnFindPatient = By.xpath("//*[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]");
    private By btnActiveVisits = By.xpath("//*[@id=\"org-openmrs-module-coreapps-activeVisitsHomepageLink-org-openmrs-module-coreapps-activeVisitsHomepageLink-extension\"]");
    private By btnRegisterPatient = By.xpath("//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]");
    private By btnCaptureVitals = By.xpath("//*[@id=\"referenceapplication-vitals-referenceapplication-vitals-extension\"]");
    private By btnAppointmentScheduling = By.xpath("//*[@id=\"appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension\"]");
    private By btnReports = By.xpath("//*[@id=\"reportingui-reports-homepagelink-reportingui-reports-homepagelink-extension\"]");
    private By btnDataManagerment = By.xpath("//*[@id=\"coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension\"]");
    private By btnConfigureMetadata = By.xpath("//*[@id=\"org-openmrs-module-adminui-configuremetadata-homepageLink-org-openmrs-module-adminui-configuremetadata-homepageLink-extension\"]");
    private By btnSystemAdministration = By.xpath("//*[@id=\"coreapps-systemadministration-homepageLink-coreapps-systemadministration-homepageLink-extension\"]");

    public HomePage(WebDriver driver) {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("Admin");
        loginPage.setPassword("Admin123");
        loginPage.setLocation("Inpatient Ward");
        loginPage.clickLoginButton();
        this.driver = driver;
    }
    public void clickLogoutButton() {
        driver.findElement(btnLogout).click();
    }
    public void clickRegisterPatientButton() {
        driver.findElement(btnRegisterPatient).click();
    }
}
