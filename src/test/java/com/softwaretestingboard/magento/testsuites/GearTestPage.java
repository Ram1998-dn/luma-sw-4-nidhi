package com.softwaretestingboard.magento.testsuites;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductDetailPage;
import com.softwaretestingboard.magento.pages.ProductListPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTestPage extends BaseTest {

    HomePage homePage = new HomePage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        homePage.mouseHoverOnGear();
        homePage.mouseHoverAndClickOnBags();
       productListPage.clickOnOverNightDuffle();
       productDetailPage.changeQuantity("3");
        productDetailPage.clickOnAddToCart();
        Assert.assertEquals(productDetailPage.getSuccessMessageOfAddToCart(), "You added Overnight Duffle to your shopping cart.",
                "product not add in cart");
       productDetailPage.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getProductNameOfOvernightDuffle(), "Overnight Duffle",
                "product name Mismatch");
        Thread.sleep(2000);

        Assert.assertEquals(shoppingCartPage.getPriseOfProduct(), "$135.00",
                "Price Mismatch");
        shoppingCartPage.changeQuantity("5");
        shoppingCartPage.clickOnUpdateButton();
        Thread.sleep(2000);
        Assert.assertEquals(shoppingCartPage.getPriseOfProduct(), "$225.00",
                "Updated Price Mismatch");

    }
}
