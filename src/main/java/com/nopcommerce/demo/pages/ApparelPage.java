package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelField = By.tagName("h1");

    public String apparel() {
        return getTextFromElement(apparelField);

    }
}

