package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    // Bag Product Name 'Overnight Duffle'
    By bagProductName = By.xpath("/a[normalize-space()='Overnight Duffle']");
    // Verify the text 'Overnight Duffle'
    By TextOvernightDuffle = By.xpath("//span[@class='base']");
    // change Qty
    By bagQuantity = By.xpath("//input[@id='qty']");
    // Add to cart Button path
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    // Verify the text 'You added overnight Duffle to your shopping cart.'
    By youAdded_ProductTextMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    // Click on 'Shopping cart' Link into message
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    //****************Methods***********************//[

    // Click on Product Name 'Overnight Duffle'
    public void clickOnBagProductName() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(bagProductName);
    }
}
