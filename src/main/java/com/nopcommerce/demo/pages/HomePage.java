package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By logOutLink = By.linkText("Log out");
    By computerField = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By electronicsField = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By apparelField = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]");
    By digitalDownloadField = By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]");
    By booksField = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
    By jewelryField = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");
    By giftCardsField = By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");


    public void clickOnLoginLink(){

        clickOnElement(loginLink);
    }
    public String logOutTextLink(){
        return getTextFromElement(logOutLink);
    }
    public void clickOnRegisterLink(){

        clickOnElement(registerLink);
    }
    public void clickOnComputer() {
        clickOnElement(computerField);
    }
    public void clickOnelectronics() {
        clickOnElement(electronicsField);
    }
    public void clickOnApparel () {
        clickOnElement(apparelField);
    }
    public void clickOnDigitalDownload() {
        clickOnElement(digitalDownloadField);
    }
    public void clickOnBook() {
        clickOnElement(booksField);
    }
    public void clickOnJewelry() {
        clickOnElement(jewelryField);
    }
    public void clickOnGiftCards() {
        clickOnElement(giftCardsField);
    }
    }
