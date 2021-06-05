package login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPatientPage;

public class RegisterPatientTest {
    private WebDriver driver;
    protected RegisterPatientPage registerPatientPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\_VKU\\2020_2021\\HocKy2\\KiemThuPhanMem\\Project/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Test
    @DisplayName("TC008")
    public void TestCase008() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.
    }

    @AfterEach
    public void tearDown() {
//        driver.quit();
    }
}
