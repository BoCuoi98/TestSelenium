package login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import pages.HomePage;

public class LogoutTest {
    WebDriver driver;
    protected HomePage homePage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Test
    @DisplayName("TC007")
    public void TestCase007() {
        homePage = new HomePage(driver);
        homePage.clickLogoutButton();
        Assertions.assertEquals("https://demo.openmrs.org/openmrs/login.htm", driver.getCurrentUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
