package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AccountsPage;
import pages.ContactsPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    LoginPage registrationUser;
    AccountsPage accountsPage;
    ContactsPage contactsPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        registrationUser = new LoginPage(driver);
        accountsPage = new AccountsPage(driver);
        contactsPage = new ContactsPage(driver);
    }
    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }
}
