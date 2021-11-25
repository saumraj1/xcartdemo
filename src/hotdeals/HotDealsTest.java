package hotdeals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class HotDealsTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/shipping.htm";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifySaleProductsArrangeAlphabetically() {
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"));
        mouseHover(By.linkText("Sale"));
        clickOnElement(By.linkText("Sale"));
        verifyTheText("Sale", By.xpath("(//h1[contains(text(),'Sale')]"));
        mouseHover(By.xpath("//span[@contains(text()='Sort by:']"));
        selectByVisibleTextFromDropDown(By.xpath("//span[@class='sort-by-label']"), "Name A - Z");

        //Verification of ascending to descending
        mouseHover(By.xpath("//span[@class='sort-by-value']"));
        selectByVisibleTextFromDropDown(By.xpath("//div[contains(@class,'sort-box')]//li"), "Name A -Z "); //By.xpath("//a[normalize-space()='Name A -Z']"));

    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"));
        mouseHover(By.linkText("Sale"));
        clickOnElement(By.linkText("Sale"));
        verifyTheText("Sale", By.xpath("(//h1[contains(text(),'Sale')]"));
        mouseHover(By.xpath("//span[@contains(text()='Sort by:']"));
        selectByVisibleTextFromDropDown(By.xpath("//span[@class='sort-by-label']"), "Price Low -High");

        mouseHover(By.xpath("//span[@class='sort-by-value']"));

        selectByVisibleTextFromDropDown(By.xpath("//div[contains(@class,'sort-box')]//li"), "Price Low -High");// By.xpath("//a[normalize-space()='Name A -Z']"));


    }

    @Test
    public void vefirySalesProductsArrangedByRates() {
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"));
        mouseHover(By.linkText("Sale"));
        clickOnElement(By.linkText("Sale"));
        verifyTheText("Sale", By.xpath("(//h1[contains(text(),'Sale')]"));
        mouseHover(By.xpath("//span[@contains(text()='Sort by:']"));
        selectByVisibleTextFromDropDown(By.xpath("//span[@class='sort-by-label']"), "Rates");

        mouseHover(By.xpath("//span[@class='sort-by-value']"));
        selectByVisibleTextFromDropDown(By.xpath("//div[contains(@class,'sort-box')]//li"), "Rates");
        By.xpath("//a[normalize-space()='Name A -Z']");

    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"));
        mouseHover(By.linkText("Sale"));
        clickOnElement(By.linkText("Sale"));
        verifyTheText("Sale", By.xpath("(//h1[contains(text(),'Sale')]"));
        mouseHover(By.xpath("//span[@contains(text()='Sort by:']"));
        selectByVisibleTextFromDropDown(By.xpath("//span[@class='sort-by-label']"), "Name Z - A ");

        mouseHover(By.xpath("//span[@class='sort-by-value']"));

        selectByVisibleTextFromDropDown(By.xpath("//div[contains(@class,'sort-box')]//li"), "Name Z - A");// By.xpath("//a[normalize-space()='Name A -Z']"))


    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"));
        mouseHover(By.linkText("Sale"));
        clickOnElement(By.linkText("Sale"));
        verifyTheText("Sale", By.xpath("(//h1[contains(text(),'Sale')]"));
        mouseHover(By.xpath("//span[@contains(text()='Sort by:']"));
        selectByVisibleTextFromDropDown(By.xpath("//span[@class='sort-by-label']"), "Price High - Low");

        mouseHover(By.xpath("//span[@class='sort-by-value']"));

        selectByVisibleTextFromDropDown(By.xpath("//div[contains(@class,'sort-box')]//li"), "Price High -Ligh");// By.xpath("//a[normalize-space()='Name A -Z']"));

    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() {
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"));
        mouseHover(By.linkText("Sale"));
        clickOnElement(By.linkText("Sale"));
        verifyTheText("Sale", By.xpath("(//h1[contains(text(),'Sale')]"));
        mouseHover(By.xpath("//span[@contains(text()='Sort by:']"));
        selectByVisibleTextFromDropDown(By.xpath("//span[@class='sort-by-label']"), "Rates");

        mouseHover(By.xpath("//span[@class='sort-by-value']"));

        selectByVisibleTextFromDropDown(By.xpath("//div[contains(@class,'sort-box')]//li"), "Rates");// By.xpath("//a[normalize-space()='Name A -Z']"));

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
