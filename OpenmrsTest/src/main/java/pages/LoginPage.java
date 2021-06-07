package pages;

import org.openqa.selenium.*;

public class LoginPage {
    private WebDriver driver;
    private By lbError = By.xpath("//*[@id=\"error-message\"]");
    private By tfUsername = By.xpath("//*[@id=\"username\"]");
    private By tfPassword = By.xpath("//*[@id=\"password\"]");
    private By lbLocotion = By.xpath("//*[@id=\"sessionLocationError\"]");
    private By btnLogin = By.xpath("//*[@id=\"loginButton\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUserName(String userName) {
        driver.findElement(tfUsername).sendKeys(userName);
    }
    public String getError() {
        String error = driver.findElement(lbError).getText();
        return error;
    }
    public void setPassword(String password) {
        driver.findElement(tfPassword).sendKeys(password);
    }
    public void setLocation(String location) { driver.findElement(By.id(location)).click(); }
    public String getLocation() {
        String location = driver.findElement(lbLocotion).getText();
        return location;
    }
    public void clickLoginButton() {
        driver.findElement(btnLogin).click();
    }
}
