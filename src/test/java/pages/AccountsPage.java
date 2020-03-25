package pages;

import elements.DropDown;
import elements.TextArea;
import elements.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AccountsPage extends BasePage {
    public AccountsPage(WebDriver driver) {
        super(driver);
    }
    By clickButtonNew = By.cssSelector("div[title=New]");
    By clickButtonSave = By.cssSelector("div[title=Save]");
    String url = "https://ap16.lightning.force.com/lightning/o/Account/list?filterName=Recent";
    @Override
    public AccountsPage openPage(){
        driver.get(url);
        return this;
    }
    @Override
    public AccountsPage isOpenPage(){
        return this;
    }
    @Override
    public LoginPage openPage(String url) {
        return null;
    }
    @Override
    public LoginPage isOpenedPage() {
        return null;
    }
    public AccountsPage clickNew(){
        driver.findElement(clickButtonNew).click();
        return this;
    }
    public AccountsPage createAccount(){
        new TextArea("Description").write(driver,"Minsk");
        new DropDown("Type").selectValue(driver,"Reseller");
        new TextInput("Account Name").write(driver,"Anna");
        new TextInput("Website").write(driver,"onliner.by");
        new TextInput("Phone").write(driver,"+123456789");
        new TextInput("Employees").write(driver,"25");
        new TextInput("Billing City").write(driver, "Minsk");
        new TextInput("Billing Country").write(driver, "Belarus");
        new TextInput("Billing State/Province").write(driver, "Minsk");
        new TextInput("Billing Zip/Postal Code").write(driver, "447");
        new TextInput("Shipping City").write(driver, "Moscow");
        new TextInput("Shipping State/Province").write(driver, "Moscow");
        new TextInput("Shipping Zip/Postal Code").write(driver, "597");
        new TextInput("Shipping Country").write(driver, "Russia");
        return this;
    }

    public AccountsPage clickButtonSave() {
        driver.findElement(clickButtonSave).click();
        return this;
    }
}
