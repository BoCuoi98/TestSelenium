package login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import pages.RegisterPatientPage;

public class RegisterPatientTest {
    private WebDriver driver;
    protected RegisterPatientPage registerPatientPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Test
    @DisplayName("TC008")
    public void TestCase008() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.clickUnidentifiedPatient();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.clickConfirmButton();

    }

    @Test
    @DisplayName("TC009")
    public void TestCase009() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.clickUnidentifiedPatient();
        registerPatientPage.clickNextButton();
        Assertions.assertEquals("Required", registerPatientPage.getError());
    }

    @Test
    @DisplayName("TC010")
    public void TestCase010() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.setNameMiddle("duc");
        registerPatientPage.setFamilyName("tran");
        registerPatientPage.clickNextButton();
        Assertions.assertEquals("Required", registerPatientPage.getError());
    }

    @Test
    @DisplayName("TC011")
    public void TestCase011() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.setNameGiven("anh");
        registerPatientPage.setNameMiddle("duc");
        registerPatientPage.clickNextButton();
        Assertions.assertEquals("Required", registerPatientPage.getError());
    }

    @Test
    @DisplayName("TC012")
    public void TestCase012() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.setNameGiven("anh");
        registerPatientPage.setNameMiddle("duc");
        registerPatientPage.setFamilyName("tran");
        registerPatientPage.clickNextButton();
        registerPatientPage.clickNextButton();
        Assertions.assertEquals("Required", registerPatientPage.getError());
    }

    @Test
    @DisplayName("TC013")
    public void TestCase013() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.setNameGiven("anh");
        registerPatientPage.setNameMiddle("duc");
        registerPatientPage.setFamilyName("tran");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.clickNextButton();
        Assertions.assertEquals("Required", registerPatientPage.getError());
    }

    @Test
    @DisplayName("TC014")
    public void TestCase014() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.setNameGiven("anh");
        registerPatientPage.setNameMiddle("duc");
        registerPatientPage.setFamilyName("tran");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.setDay("16");
        registerPatientPage.setMonth(8);
        registerPatientPage.setYear("2000");
        registerPatientPage.clickNextButton();
        registerPatientPage.clickNextButton();
        Assertions.assertEquals("You need to provide a value for at least one field", registerPatientPage.getError());
    }

    @Test
    @DisplayName("TC015")
    public void TestCase015() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.setNameGiven("anh");
        registerPatientPage.setNameMiddle("duc");
        registerPatientPage.setFamilyName("tran");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.setDay("16");
        registerPatientPage.setMonth(8);
        registerPatientPage.setYear("2000");
        registerPatientPage.clickNextButton();
        registerPatientPage.setAddress1("zxc");
        registerPatientPage.clickNextButton();
        registerPatientPage.clickNextButton();
        registerPatientPage.clickNextButton();
        registerPatientPage.clickConfirmButton();

    }

    @Test
    @DisplayName("TC016")
    public void TestCase016() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.setNameGiven("anh");
        registerPatientPage.setNameMiddle("duc");
        registerPatientPage.setFamilyName("tran");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.setDay("16");
        registerPatientPage.setMonth(8);
        registerPatientPage.setYear("2000");
        registerPatientPage.clickNextButton();
        registerPatientPage.setAddress1("zxc");
        registerPatientPage.clickNextButton();
        registerPatientPage.setPhone("123456789");
        registerPatientPage.clickNextButton();
        registerPatientPage.setRelationshipType("Doctor");
        registerPatientPage.setPersonName("Khánh");
        registerPatientPage.clickNextButton();
        registerPatientPage.clickConfirmButton();

    }

    @Test
    @DisplayName("TC017")
    public void TestCase017() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.setNameGiven("anh");
        registerPatientPage.setNameMiddle("duc");
        registerPatientPage.setFamilyName("tran");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.setDay("16");
        registerPatientPage.setMonth(8);
        registerPatientPage.setYear("2000");
        registerPatientPage.clickNextButton();
        registerPatientPage.setAddress1("zxc");
        registerPatientPage.clickNextButton();
        registerPatientPage.setPhone("123456789");
        registerPatientPage.clickNextButton();
        registerPatientPage.clickNextButton();
        registerPatientPage.clickConfirmButton();

    }

    @Test
    @DisplayName("TC018")
    public void TestCase018() {
        registerPatientPage = new RegisterPatientPage(driver);
        registerPatientPage.setNameGiven("anh");
        registerPatientPage.setNameMiddle("duc");
        registerPatientPage.setFamilyName("tran");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.setDay("16");
        registerPatientPage.setMonth(8);
        registerPatientPage.setYear("2000");
        registerPatientPage.clickNextButton();
        registerPatientPage.setAddress1("zxc");
        registerPatientPage.clickNextButton();
        registerPatientPage.clickNextButton();
        registerPatientPage.setRelationshipType("Doctor");
        registerPatientPage.setPersonName("Khánh");
        registerPatientPage.clickNextButton();
        registerPatientPage.clickConfirmButton();

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
