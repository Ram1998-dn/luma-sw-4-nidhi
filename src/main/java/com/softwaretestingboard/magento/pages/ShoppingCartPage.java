package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartTitle = By.xpath("//span[@class='base']");
    By cronusYogaPent = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("//dd[contains(text(),'32')]");
    By colorBlack = By.xpath("//dd[contains(text(),'Black')]");

    By overnightDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By quantity = By.xpath("//input[@title='Qty']");
    By price = By.xpath("(//span[@class='cart-price']//span)[2]");
    By changeQty = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public String getShoppingCartTitle(){
        return getTextFromElement(shoppingCartTitle);
    }

    public String getProductNameOfCronusYogaPent(){
        return getTextFromElement(cronusYogaPent);
    }

    public String getSize32(){
        return getTextFromElement(size32);
    }

    public String getProductColorBlack(){
        return getTextFromElement(colorBlack);
    }

    public String getProductNameOfOvernightDuffle(){
        return getTextFromElement(overnightDuffle);
    }

    public String getQuantityOfProduct(){
        return getTextFromElement(quantity);
    }

    public String getPriseOfProduct(){
        return getTextFromElement(price);
    }

    public void changeQuantity(String qty){
        sendTextToElementWithClearText(changeQty, qty);
    }

    public void clickOnUpdateButton(){
        clickOnElement(updateButton);
    }

}
