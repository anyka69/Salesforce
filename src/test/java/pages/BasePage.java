package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;


    BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 20);
    }

    public abstract AccountsPage openPage();

    public abstract AccountsPage isOpenPage();

    public abstract LoginPage openPage(String url);
    public abstract LoginPage isOpenedPage();
}