package tests;

import base.BaseTest;

import com.yashu.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginButtonDisabledWhenFieldsEmpty() {
        LoginPage lp = new LoginPage(driver);
        Assert.assertFalse(lp.isLoginButtonEnabled(), "Login button should be disabled when fields are empty");
    }

    @Test
    public void testInvalidLoginShowsError() {
        LoginPage lp = new LoginPage(driver);
        lp.enterUserId("wrongUser");
        lp.enterPassword("wrongPass");
        lp.clickLogin();
        // Later: add assertion for error message once locator is known
    }

    @Test
    public void testPasswordMaskedToggle() {
        LoginPage lp = new LoginPage(driver);
        lp.enterPassword("hello123");
        lp.clickEyeIcon();
        // Later: you can check attribute "type" of input to confirm it changed from "password" to "text"
    }
}
