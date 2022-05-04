package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadPage digitalDownloadPage = new DigitalDownloadPage();
    BookPage bookPage = new BookPage();
    GiftCardPage giftCardPage = new GiftCardPage();
    JewerlyPage jewerlyPage = new JewerlyPage();


    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputer();
        String actualText = computerPage.computerText();
        String expectedText = "Computers";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        homePage.clickOnelectronics();
        String actualText = electronicsPage.electronics();
        String expectedText = "Electronics";
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        homePage.clickOnApparel();
        String actualText = apparelPage.apparel();
        String expectedText = "Apparel";
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        homePage.clickOnDigitalDownload();
        String actualText = digitalDownloadPage.digitalDownload();
        String expectedText = "Digital downloads";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        homePage.clickOnBook();
        String actualText = bookPage.book();
        String expectedText = "Books";
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homePage.clickOnJewelry();
        String actualText = jewerlyPage.jewerly();
        String expectedText = "Jewelry";
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homePage.clickOnGiftCards();
        String actualText = giftCardPage.giftCard();
        String expectedText = "Gift Cards";
        Assert.assertEquals(expectedText, actualText);
    }
}
