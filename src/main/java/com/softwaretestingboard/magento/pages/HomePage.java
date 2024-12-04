package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By consent = By.xpath("//button[@aria-label = 'Consent']");
    By women = By.xpath("//span[normalize-space()='Women']");
    By top = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By man = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    By pents = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By gear = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");


    public void clickOnConsent(){
        clickOnElement(consent);
    }

    public void mouseHoverOnWomen(){
        mouseHoverToElement(women);
    }
    public void mouseHoverOnTop(){
        mouseHoverToElement(top);
    }

    public void mouseHoverAndClickOnJackets(){
        mouseHoverToElementAndClick(jackets);
    }

    public void mouseHoverOnMan(){
        mouseHoverToElement(man);
    }
    public void mouseHoverOnBottom(){
        mouseHoverToElement(bottoms);
    }

    public void mouseHoverAndClickOnPents(){
        mouseHoverToElementAndClick(pents);
    }

    public void mouseHoverOnGear(){
        mouseHoverToElement(gear);
    }

    public void mouseHoverAndClickOnBags(){
        mouseHoverToElementAndClick(bags);
    }
}

