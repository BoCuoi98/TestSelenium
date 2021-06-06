package login;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    private WebDriver driver;

    @BeforeEach
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\_VKU\\2020_2021\\HocKy2\\KiemThuPhanMem\\Project/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void TestCase() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//        driver.switchTo().alert().accept();
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        System.out.println(driver.switchTo().alert().getText());
    }
}
