package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ProductDetailPage extends Utility {


    By quantity = By.xpath("//input[@id='qty']");
    By btnAddToCart = By.xpath("//button[@id='product-addtocart-button']");
    By successMessageOfAddToCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void changeQuantity(String qty){
        sendTextToElementWithClearText(quantity, qty);
    }

    public void clickOnAddToCart(){
        clickOnElement(btnAddToCart);
    }

    public String getSuccessMessageOfAddToCart(){
        return getTextFromElement(successMessageOfAddToCart);
    }

    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
}
