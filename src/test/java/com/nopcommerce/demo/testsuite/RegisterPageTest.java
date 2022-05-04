package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        String actualText =registerPage.registration();
        String expectedText = "Register";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.enterFirstName("Manoj");
        registerPage.enterLastName("Patel");
        registerPage.gender();
        registerPage.selectDay("28");
        registerPage.selectMonth("May");
        registerPage.selectYear("1974");
        registerPage.enterEmail("abcdefgh@gmail.com");
        registerPage.enterPassword("123456789");
        registerPage.enterConfirmPassword("123456789");
        registerPage.clickOnRegistration();
        String actualText =registerPage.registrationCompliton();
        String expectedText = "Your registration completed";
        Assert.assertEquals(expectedText,actualText);



    }

}
