package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void Login(){
        registrationUser
                .openPage("https://login.salesforce.com/")
                .inputUserName("anyka69-z8j8@force.com")
                .inputPassword("qwerty123")
                .clickLogin();
        accountsPage
                .openPage()
                .clickNew()
                .createAccount()
                .clickButtonSave();
    }
}