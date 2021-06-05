package login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class LogoutTest {
    WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\_VKU\\2020_2021\\HocKy2\\KiemThuPhanMem\\Project/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Test
    @DisplayName("TC005")
    public void TestCase005() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("Admin");
        loginPage.setPassword("Admin123");
        loginPage.setLocation("Inpatient Ward");
        loginPage.clickLoginButton();
        homePage = new HomePage(driver);
        homePage.clickLogoutButton();
        Assertions.assertEquals("https://demo.openmrs.org/openmrs/login.htm", driver.getCurrentUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
