package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BookPage extends Utility {
    By booksField =By.tagName("h1");

    public String book(){
        return getTextFromElement(booksField);
    }
}
