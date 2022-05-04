package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class JewerlyPage extends Utility {
    By jewerlyField =By.tagName("h1");

    public String jewerly(){
        return getTextFromElement(jewerlyField);
    }
}
