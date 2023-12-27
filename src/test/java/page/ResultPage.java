package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage extends BasePage {

    public ResultPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(xpath = "//button[normalize-space()='OKAY, GOT IT!']")
    WebElement btnOkay;

    @FindBy(xpath = "//div[contains(text(),'₹ 29,548')]")
    WebElement price;

    public void clickOk() {
        clickAndWait(btnOkay);
    }

    public String getValuePrice() {
        return getText(price);
    }

}
