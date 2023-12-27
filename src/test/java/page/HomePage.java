package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(xpath = "//li[@class='menu_Flights']")
    WebElement optionMenuFlights;

    @FindBy(id="fromCity")
    WebElement clickFromCity;

    @FindBy(xpath = "//input[@placeholder='From']")
    WebElement fieldFromCity;

    @FindBy(xpath = "//p[normalize-space()='Jakarta, Indonesia']")
    WebElement cityFrom;

    @FindBy(xpath = "//input[@id='toCity']")
    WebElement clickToCity;

    @FindBy(xpath = "//input[@placeholder='To']")
    WebElement fieldToCity;

    @FindBy(xpath = "//p[normalize-space()='Busan, South Korea']")
    WebElement cityTo;

    @FindBy(xpath = "//a[normalize-space()='Search']")
    WebElement btnSearch;

    @FindBy(xpath = "//div[@aria-label='Mon Jan 08 2024']")
    WebElement dateDeparture;

    public void selectMenuFlights(){
        clickAndWait(optionMenuFlights);
    }

    public void selectFromCity() {
        clickAndWait(clickFromCity);
    }

    public void setFieldFromCity(String from_city) {
        setText(fieldFromCity, from_city);
    }

    public void selectOptionFromCity() {
        clickAndWait(cityFrom);
    }

    public void selectToCity() {
        clickAndWait(clickToCity);
    }

    public void setFieldToCity(String to_city) {
        setText(fieldToCity, to_city);
    }

    public void selectOptionToCity() {
        clickAndWait(cityTo);
    }

    public void clickButtonSearch() {
        clickAndWait(btnSearch);
    }

    public void selectDateDeparture() {
        clickAndWait(dateDeparture);
    }

}
