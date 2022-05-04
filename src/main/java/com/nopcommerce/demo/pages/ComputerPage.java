package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By computerTextField =By.tagName("h1");


    public String computerText(){
        return getTextFromElement(computerTextField);
    }
}
