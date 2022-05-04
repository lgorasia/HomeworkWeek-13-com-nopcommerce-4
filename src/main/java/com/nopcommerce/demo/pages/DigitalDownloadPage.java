package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadPage extends Utility {
    By digitalDownloadField=By.tagName("h1");

    public String digitalDownload(){
        return getTextFromElement(digitalDownloadField);
    }
}
