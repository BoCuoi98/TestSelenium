package login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import pages.FindPatientsPage;

public class SearchPatientTest {
    WebDriver driver;
    protected FindPatientsPage findPatientsPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Test
    @DisplayName("TC021")
    public void TestCase021() {
        findPatientsPage = new FindPatientsPage(driver);
        findPatientsPage.setSearch("anh anh anh");

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
