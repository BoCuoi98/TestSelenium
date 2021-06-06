package login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import pages.FindPatientsPage;
import pages.HomePage;

public class ViewPatientTest {
    WebDriver driver;
    protected FindPatientsPage findPatientsPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Test
    @DisplayName("TC020")
    public void TestCase020() {
        findPatientsPage = new FindPatientsPage(driver);
        findPatientsPage.clickRecord("1");

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
