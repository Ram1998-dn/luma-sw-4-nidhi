package com.softwaretestingboard.magento.testsuites;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductListPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTestPage extends BaseTest {

    HomePage homePage = new HomePage();
    ProductListPage productListPage =new ProductListPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){

        homePage.mouseHoverOnMan();
        homePage.mouseHoverOnBottom();
        homePage.mouseHoverAndClickOnPents();
        productListPage.mouseHoverOnCronusYogaPents();
        productListPage.clickOnSize32();
        productListPage.clickOnColorBlack();
        productListPage.mouseHoverOnCronusYogaPents();
        productListPage.clickOnAddCartInCronusYogaPents();
        Assert.assertEquals(productListPage.getSuccessMessageOfAddToCart(),
                "You added Cronus Yoga Pant to your shopping cart.",
                "Product not added in cart!");
        productListPage.clickOnShoppingCart();

        Assert.assertEquals(shoppingCartPage.getShoppingCartTitle(),
                "Shopping Cart",
                "page title Mismatch!");

        Assert.assertEquals(shoppingCartPage.getProductNameOfCronusYogaPent(),
                "Cronus Yoga Pant",
                "Product name Mismatch!");

        Assert.assertEquals(shoppingCartPage.getSize32(),
                "32",
                "Product size Mismatch!");

        Assert.assertEquals(shoppingCartPage.getProductColorBlack(),
                "Black",
                "Product color Mismatch!");

    }
}
