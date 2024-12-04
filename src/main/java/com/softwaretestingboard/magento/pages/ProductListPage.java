package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPage extends Utility {

    By nameListOfProduct = By.xpath("//strong[@class='product name product-item-name']//a");
    By productSorting = By.xpath("(//select[@id='sorter'])[1]");
    By priceListOfProduct = By.xpath("//span[@class='price-wrapper ']//span");

    By cronusYogaPents = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    By colorBlack = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToCartCronusYogaPents = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By successMsgOfAddToCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    By overNightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");


    public List<WebElement> getListOfProductName(){
        return getWebElements(nameListOfProduct);
    }

    public void selectProductSortingOption(String option){
        selectByVisibleTextFromDropDown(productSorting, option);
    }

    public List<WebElement> getListOfProductPrice(){
        return getWebElements(priceListOfProduct);
    }

    public void mouseHoverOnCronusYogaPents(){
        mouseHoverToElement(cronusYogaPents);
    }

    public void clickOnSize32(){
        clickOnElement(size32);
    }

    public void clickOnColorBlack(){
        clickOnElement(colorBlack);
    }

    public void clickOnAddCartInCronusYogaPents(){
        clickOnElement(addToCartCronusYogaPents);
    }

    public String getSuccessMessageOfAddToCart(){
        return getTextFromElement(successMsgOfAddToCart);
    }

    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
    }

    public void clickOnOverNightDuffle(){
        clickOnElement(overNightDuffle);
    }
}
