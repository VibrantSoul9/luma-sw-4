package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By top = By.xpath("//a[@id='ui-id-9']");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    //  By filterByProductName = By.xpath("//select[@id='sorter'])[1]");
    By verifyProductText = By.xpath("//strong[@class='product name product-item-name']//a");
    By jacketsNameListBeforeSorting = By.xpath("//strong[@class='product name product-item-name']//a");
    By filterProductName = By.xpath("(//select[@id='sorter'])[1]");
    By jacketsNameListAfterSorting = By.xpath("//strong[@class='product name product-item-name']//a");
    By jacketsPriceListBeforeSorting = By.xpath("//span[@class='price-wrapper ']//span");
    By filterPrice = By.xpath("(//select[@id='sorter'])[1]");
    By jacketsPriceListAfterSorting = By.xpath("//span[@class='price-wrapper ']//span");
    public void mouseHoverOnWomenMenu()
    {
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTops()
    {
        mouseHoverToElement(top);
    }
    public void clickOnJackets()
    {
        mouseHoverToElementAndClick(jackets);
    }


    public List<String> productListBeforeSorting ()
    {
        List<WebElement> jacketsElementsList = driver.findElements(jacketsNameListBeforeSorting);
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList)
        {
            jacketsNameListBefore.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        return jacketsNameListBefore;
    }


    public List<String> productListAfterSorting() throws InterruptedException {
        // Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(filterProductName, "Product Name");
        Thread.sleep(1000);
        // After Sorting value
        List<WebElement> jacketsElementsList = driver.findElements(jacketsNameListAfterSorting);
        List<String> jacketsNameListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }

        return jacketsNameListAfter;
    }


    public List<Double> priceListBeforeSorting() {
        // Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements(jacketsPriceListBeforeSorting);
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);

        return jacketsPriceListBefore;
    }

    public List<Double> priceListAfterSorting() throws InterruptedException {
        // Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(filterPrice, "Price");
        Thread.sleep(1000);
        // After Sorting Products by Price
        List<WebElement> jacketsPriceElementList = driver.findElements(jacketsPriceListAfterSorting);
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        return jacketsPriceListAfter;
    }

}
