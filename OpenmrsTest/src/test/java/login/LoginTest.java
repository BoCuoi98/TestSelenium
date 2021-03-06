package login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;
    protected LoginPage loginPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("Admin");
        loginPage.setPassword("Admin123");
        loginPage.setLocation("Inpatient Ward");
        loginPage.clickLoginButton();
        Assertions.assertEquals("https://demo.openmrs.org/openmrs/referenceapplication/home.page", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("TC002")
    public void TestCase002() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("Admin");
        loginPage.setPassword("Admin123");
        loginPage.clickLoginButton();
        Assertions.assertEquals("You must choose a location!", loginPage.getLocation());
    }

    @Test
    @DisplayName("TC003")
    public void TestCase003() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("Admin");
        loginPage.setPassword("Admin111");
        loginPage.setLocation("Inpatient Ward");
        loginPage.clickLoginButton();
        Assertions.assertEquals("Invalid username/password. Please try again.", loginPage.getError());
    }

    @Test
    @DisplayName("TC004")
    public void TestCase004() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("Admin1");
        loginPage.setPassword("Admin123");
        loginPage.setLocation("Inpatient Ward");
        loginPage.clickLoginButton();
        Assertions.assertEquals("Invalid username/password. Please try again.", loginPage.getError());
    }

    @Test
    @DisplayName("TC005")
    public void TestCase005() {
        loginPage = new LoginPage(driver);
        loginPage.setPassword("Admin123");
        loginPage.setLocation("Inpatient Ward");
        loginPage.clickLoginButton();
        Assertions.assertEquals("Invalid username/password. Please try again.", loginPage.getError());
    }

    @Test
    @DisplayName("TC006")
    public void TestCase006() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("Admin123");
        loginPage.setLocation("Inpatient Ward");
        loginPage.clickLoginButton();
        Assertions.assertEquals("Invalid username/password. Please try again.", loginPage.getError());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
