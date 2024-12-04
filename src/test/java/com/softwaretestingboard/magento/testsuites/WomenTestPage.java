package com.softwaretestingboard.magento.testsuites;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductListPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTestPage extends BaseTest {

    HomePage homePage = new HomePage();
    ProductListPage productListPage = new ProductListPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        homePage.mouseHoverOnWomen();
        homePage.mouseHoverOnTop();
        homePage.mouseHoverAndClickOnJackets();

        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : productListPage.getListOfProductName()) {
            jacketsNameListBefore.add(value.getText());
        }

        productListPage.selectProductSortingOption("Product Name");

        // After Sorting value
        List<String> jacketsNameListAfter = new ArrayList<>();
        for (WebElement value : productListPage.getListOfProductName()) {
            jacketsNameListAfter.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order

        Assert.assertEquals(jacketsNameListAfter, jacketsNameListBefore,
                "Product is not sorting by alphabetical order");
    }

    @Test
    public void verifyTheSortByPriceFilter() {

        homePage.mouseHoverOnWomen();
        homePage.mouseHoverOnTop();
        homePage.mouseHoverAndClickOnJackets();

        // Storing jackets price in list
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : productListPage.getListOfProductPrice()) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }

        productListPage.selectProductSortingOption("Price");

        // After Sorting Products by Price
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        for (WebElement value :productListPage.getListOfProductPrice()) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);

        Assert.assertEquals(jacketsPriceListAfter, jacketsPriceListBefore,
                "Product is not sorting by price");
    }
}
