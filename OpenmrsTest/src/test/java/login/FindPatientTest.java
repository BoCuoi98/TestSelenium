package login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import pages.FindPatientsPage;

public class FindPatientTest {
    WebDriver driver;
    protected FindPatientsPage findPatientsPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Test
    @DisplayName("TC019")
    public void TestCase019() {
        findPatientsPage = new FindPatientsPage(driver);

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
