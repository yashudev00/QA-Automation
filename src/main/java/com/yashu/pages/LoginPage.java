package com.yashu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Locators
    By userId = By.id("formEmail");
    By password = By.id("formPassword");
    By loginBtn = By.className("login-button");
    By eyeIcon = By.className("passowrd-visible"); // ✅ fixed

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserId(String uid) {
        driver.findElement(userId).sendKeys(uid);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginBtn).isEnabled();
    }

    public void clickEyeIcon() {
        driver.findElement(eyeIcon).click();
    }
}
