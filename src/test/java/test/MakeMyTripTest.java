package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.ResultPage;
import utilities.Utility;

public class MakeMyTripTest extends BaseTest {

    @Test
    public void VerifyTopValueFlightsSuccess() {
        HomePage homePage = new HomePage(driver, explicitWait);
        ResultPage resultPage = new ResultPage(driver, explicitWait);

        homePage.selectMenuFlights();
        homePage.selectFromCity();
        homePage.setFieldFromCity("Jakarta");
        homePage.selectOptionFromCity();

        Utility.hardWait(2);

        homePage.selectToCity();
        homePage.setFieldToCity("Busan, South Korea");
        homePage.selectOptionToCity();
        homePage.selectDateDeparture();
        homePage.clickButtonSearch();

        Utility.hardWait(5);

        resultPage.clickOk();

        Utility.hardWait(5);

        resultPage.getValuePrice();

        String txtExpectedValuePrice = "₹ 29,548";

        Assert.assertEquals(resultPage.getValuePrice(), txtExpectedValuePrice,
                "Verification failed! Value price is not as expected.");

        System.out.println("Verification passed! Value price is as expected.");
        System.out.println("Expected Result: " + txtExpectedValuePrice);
        System.out.println("Actual Result: " + resultPage.getValuePrice());

        Utility.hardWait(2);
    }

    @Test
    public void VerifyTopValueFlightsFailed() {
        HomePage homePage = new HomePage(driver, explicitWait);
        ResultPage resultPage = new ResultPage(driver, explicitWait);

        homePage.selectMenuFlights();
        homePage.selectFromCity();
        homePage.setFieldFromCity("Jakarta");
        homePage.selectOptionFromCity();

        Utility.hardWait(2);

        homePage.selectToCity();
        homePage.setFieldToCity("Busan, South Korea");
        homePage.selectOptionToCity();
        homePage.selectDateDeparture();
        homePage.clickButtonSearch();

        Utility.hardWait(5);

        resultPage.getValuePrice();

        String txtExpectedValuePrice = "₹ 25,548";

        System.out.println("Verification failed! Text is not as expected.");
        System.out.println("Expected Text: " + txtExpectedValuePrice);
        System.out.println("Actual Text: " + resultPage.getValuePrice());

        Assert.fail("Verification failed! Text is not as expected.");

        Utility.hardWait(2);
    }

}
