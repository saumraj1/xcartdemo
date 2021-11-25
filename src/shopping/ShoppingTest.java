package shopping;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.util.List;

public class ShoppingTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/shipping.htm";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

  /*  @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetooth Speaker() throws InterruptedException {
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"));
        mouseHover(By.linkText("Sale"));
        clickOnElement(By.linkText("Sale"));
        verifyTheText("Sale", By.xpath("(//h1[contains(text(),'Sale')]"));

        Thread.sleep(5000);
        mouseHover(By.xpath("//span[@contains(text()='Sort by:']"));
        mouseHover(By.xpath("//span[@class='sort-by-label']"));
        selectByVisibleTextFromDropDown(By.xpath("//span[@class='sort-by-label']"), "Name A - Z");

        clickOnElement(By.linkText("//div[@title='Your cart']"));
        clickOnElement(By.xpath("//span[contains(text),'View cart']"));
        //clickOnElement(By.xpath("//a[@class='regular-button cart']/parent::div"))


        Thread.sleep(5000);
        verifyTheText("Your shopping cart - 1 item",By.xpath("//h1[contains(@id,'page-title')]"));
        sendTextToElement(By.xpath("//input[@id='amount16']"),"2");
        verifyTheText("Your shopping cart - 2 item",By.xpath("//h1[contains(@id,'page-title')]"));

        //Verify the total(expected $39.98,real=29.98)
        verifyTheText("39.98",By.xpath("//span[starts-with(text(),'29')]"));

        //Verify the total(expected $46.18,real=37.03)
        verifyTheText("46.18",By.xpath("//span[starts-with(text(),'37')]"));
        clickOnElement(By.xpath("//span[normalize-space()='Go to checkout']"));


        //Verify the text “Log in to your account

        Thread.sleep(5000);
        verifyTheText("Log in to your account",(By.xpath("//h1[contains(@id,'page-title')]")));
        sendTextToElement(By.id("email"),"xyz1234@gmail.com");
        clickOnElement(By.xpath("//span[contains(text),'Continue']"));
        verifyTheText("Secure Checkout",By.xpath("//h1[contains(@id,'page-title')]"));

        //Filling the form
        Thread.sleep(5000);
        sendTextToElement(By.id("shippingaddress-firstname"),"xyz");
        sendTextToElement(By.id("shippingaddress-lastname"),"oza");
        sendTextToElement(By.id("shippingaddress-streetname"),"Unknown");
        sendTextToElement(By.id("shippingaddress-firstname"),"Unknown");

        Thread.sleep(5000);
        WebElement dropBtn=driver.findElement(By.id("shippingaddress- country-code"));
        Select select= new Select(dropBtn);
        select.selectByValue("GB");
        List<WebElement>allOptions=select.getOptions();
        System.out.println(allOptions.size());
        for (WebElement option:allOptions){
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase("united Kingdom")){
                option.click();
            }
        }
        Thread.sleep(5000);
        sendTextToElement(By.id("shippingaddress-custom-state"),"Unknown");
        sendTextToElement(By.id("shippingaddress-Zipcode"),"Unknown");
        sendTextToElement(By.id("email"),"xyz1234@gmail.com");
        clickOnElement(By.className("subbox create checkbox"));
        sendTextToElement(By.id("password"),"xyz1234");

        Thread.sleep(5000);
        clickOnElement(By.className("rate-title"));
        clickOnElement(By.className("payment-title"));
        verifyTheText("$47.22",(By.xpath("part-integer")));
        clickOnElement(By.xpath("//span[normalize-space()='Place order:$37.03'"));
        verifyTheText("Thank you for your order",By.xpath(""));

    }
    @Test
    public void veriftThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException{
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"));
        mouseHover(By.linkText("Bestsellers"));
        clickOnElement(By.linkText("Bastsellers"));
        verifyTheText("Bastsellerd",By.xpath("//h1[contains(text(),'Bastsellers']"));

    }*/
}
