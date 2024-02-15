package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='loginEmail']")
    private WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='loginPassword']")
    private WebElement passTextBox;

    @FindBy(id = "authButton")
    private WebElement loginButton;

    public LoginPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public LoginPage signIn(String email, String password) {
        emailTextBox.sendKeys(email);
        passTextBox.sendKeys(password);
        loginButton.click();
        return this;
    }

}
