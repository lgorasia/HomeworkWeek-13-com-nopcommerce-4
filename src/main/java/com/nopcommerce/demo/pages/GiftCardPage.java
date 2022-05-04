package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardPage extends Utility {
    By giftCardField = By.tagName("h1");

    public String giftCard(){
        return getTextFromElement(giftCardField);
    }
}
