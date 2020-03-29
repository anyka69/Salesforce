package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By UserName =By.id("username");
    By Password =By.id("password");
    By ClickButtonLogin = By.id("Login");
    String url = "https://login.salesforce.com/";

    @Override
    public LoginPage openPage() {
        driver.get(url);
        return this;
    }

    @Override
    public LoginPage isOpenPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
        return this;
    }

    public LoginPage inputUserName(String username) {
        driver.findElement(UserName).sendKeys(username);
        return this;
    }
    public LoginPage inputPassword(String password) {
        driver.findElement(Password).sendKeys(password);
        return this;
    }
    public LoginPage clickLogin(){
        driver.findElement(ClickButtonLogin).click();
        return this;
    }
}
