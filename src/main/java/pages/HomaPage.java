package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomaPage extends BasePage {
    public HomaPage(WebDriver driver) {
        setDriver(driver);
        driver.get("https://telranedu.web.app/home");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);

    }

    @FindBy(xpath = "//a[text()='LOGIN']")
    WebElement btmLogin;

    // WebElement btnLogin1 = driver.findElement(By.xpath("//a[text()='LOGIN']"));

    public void clickBtnLoginHeader() {
        btmLogin.click();
        pause(3);
    }
}
