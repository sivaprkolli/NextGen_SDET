package com.sdet.TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private final WebDriver driver;
    private final SeleniumActions seleniumActions;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        seleniumActions = new SeleniumActions(driver);
        PageFactory.initElements(driver, this);
    }

    private final By usernameInputBox = By.name("user-name");
    private final By passwordInputBox = By.id("password");
    private final By loginButton = By.className("submit-button");

    @FindBy(name = "user-name")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(className = "submit-button")
    private WebElement signInButton;

    public void loginAsUser(String userName, String password){
        driver.findElement(usernameInputBox).sendKeys(userName);
        driver.findElement(passwordInputBox).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void loginAsAdmin(String username, String password){
        seleniumActions.typeValue(usernameInputBox, username);
        seleniumActions.typeValue(passwordInputBox, password);
        //seleniumActions.clickOnWebElement(loginButton);
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password){
        seleniumActions.typeValue(userNameInput, username);
        seleniumActions.typeValue(passwordInput, password);
        seleniumActions.clickOnWebElement(signInButton);
    }
}
