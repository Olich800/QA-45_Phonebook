package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);

    }

    @FindBy(xpath = "//input[@name='email']")
    WebElement inputEmail;

    public void typeLoginForm(String email, String password) {
        inputEmail.sendKeys(email);

    }
    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;

    public void typePasswordForm(String email, String password){
        inputPassword.sendKeys(password);
    }

    @FindBy(xpath = "//button[@name='registration']")
    WebElement btnRegistration;

    public void registration(String email, String password)
    {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        btnRegistration.click();

    }
}
