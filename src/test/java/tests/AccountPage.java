package tests;

import org.testng.annotations.Test;

public class AccountPage extends BaseTest {
    @Test
    public void Login() {
        registrationUser
                .openPage()
                .inputUserName("anyka69-z8j8@force.com")
                .inputPassword("qwerty123")
                .clickLogin();
        accountsPage
                .openPage()
                .clickNew()
                .createAccount()
                .clickButtonSave();
        contactsPage
                .openPage()
                .clickNew()
                .createContacts()
                .clickButtonSave();
    }
}