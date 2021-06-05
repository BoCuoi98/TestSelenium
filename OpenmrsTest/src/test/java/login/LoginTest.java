package login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;
    protected LoginPage loginPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\_VKU\\2020_2021\\HocKy2\\KiemThuPhanMem\\Project/chromedriver.exe");
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
        Assertions.assertEquals("https://demo.openmrs.org/openmrs/referenceapplication/login.page", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("TC004")
    public void TestCase004() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("Admin123");
        loginPage.setPassword("Admin123");
        loginPage.setLocation("Inpatient Ward");
        loginPage.clickLoginButton();
        Assertions.assertEquals("https://demo.openmrs.org/openmrs/referenceapplication/login.page", driver.getCurrentUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
