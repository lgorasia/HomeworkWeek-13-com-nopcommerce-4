package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homepage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailID("abcdefgh@gmail.com");
        loginPage.enterPassword("123456789");
        loginPage.cliclOnLoginButton();
        String actualText = homepage.logOutTextLink();
        String expectedText = "Log out";
        Assert.assertEquals(actualText,expectedText);
   }
    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailID("Prime1e23@gmail.com");
        loginPage.enterPassword("Prime123");
        loginPage.cliclOnLoginButton();

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }


}
