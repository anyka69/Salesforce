package pages;

import elements.DropDown;
import elements.TextArea;
import elements.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage {
    By clickButtonNew = By.cssSelector("div[title=New]");
    By clickButtonSave = By.cssSelector("button[title=Save]");
    By ACCOUNT_NAMES = By.cssSelector("a[role=option]");
    String url = "https://ap16.lightning.force.com/lightning/o/Contact/list?filterName=Recent";

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactsPage openPage() {
        driver.get(url);
        return this;
    }

    @Override
    public BasePage isOpenPage() {
        return null;
    }

    public ContactsPage clickNew() {
        driver.findElement(clickButtonNew).click();
        return this;
    }
    public ContactsPage createContacts() {
        new DropDown("Salutation").selectValue(driver, "Dr.");
        new TextInput("First Name").write(driver, "Anna");
        new TextInput("Title").write(driver, "Welcome");
        new TextInput("Phone").write(driver, "+123456789");
        new TextInput("Mobile").write(driver, "+37533358936");
        new TextInput("Email").write(driver, "123@mail.ru");
        new TextArea("Mailing Street").write(driver, "Minsk");
        new TextInput("Mailing Country").write(driver, "Belarus");
        new TextInput("Mailing State/Province").write(driver, "Minsk");
        new TextInput("Mailing Zip/Postal Code").write(driver, "447");
        new TextInput("Other City").write(driver, "Moscow");
        new TextInput("Other State/Province").write(driver, "Moscow");
        new TextInput("Other Zip/Postal Code").write(driver, "597");
        new TextInput("Other Country").write(driver, "Russia");
        new TextInput("Fax").write(driver, "459875");
        new TextInput("Home Phone").write(driver, "+566556459875");
        new TextInput("Other Phone").write(driver, "+36589459875");
        new TextInput("Asst. Phone").write(driver, "+6625459875");
        new TextInput("Assistant").write(driver, "Nik");
        new TextInput("Department").write(driver, "123");
        new DropDown("Lead Source").selectValue(driver, "Other");
        new TextInput("Birthdate").write(driver, "08.09.2003");
        new TextArea("Description").write(driver, "Other");
        driver.findElement(By.xpath("//div[contains(@class,'isModal')]//span[contains(text(),'Account Name')]/../..//input")).click();
        driver.findElements(ACCOUNT_NAMES).get(1);
        return this;
    }
    public ContactsPage clickButtonSave() {
        driver.findElement(clickButtonSave).click();
        return this;
    }
}