package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/shipping.htm";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully()
    {
        clickOnElement(By.linkText("Shipping"));
        verifyTheText("Shipping", By.xpath("(//h1[contains(text(),'Shipping')]"));
    }
   @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully1(){
        clickOnElement(By.linkText("New!"));
        verifyTheText("New arrivals",By.xpath("//h1[@id='page-title']"));

    }
    @Test
    public void  verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        clickOnElement(By.linkText("Coming soon"));
        verifyTheText("Coming soon",By.xpath("//h1[@class='title']"));
    }
    @Test
    public void  verifyUserShouldNavigateToContactUsPageSuccessfully(){
        clickOnElement(By.linkText("Contact us"));
        verifyTheText("Contact us",By.xpath("(//h1[contains(text(),'Contact us'])"));
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
