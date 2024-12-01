package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ContacsPage extends BasePage{
    public ContacsPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);

    }
    @FindBy(xpath = "//button[text()='Sign Out']")
    WebElement btnSignOut;

    public void clickBtnSignOut(){
        pause(3);
        btnSignOut.click();
    }
    public boolean isSignOutPresent(){
        pause(3);
        return btnSignOut.isDisplayed();

    }
    }
