package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase {
    HomePage homepage = new HomePage();
    MenPage menpage = new MenPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homepage.mouseHoverOnMenMenu();
        homepage.mouseHoverOnBottom();
        homepage.clickOnPants();

        menpage.pantSize();
        Thread.sleep(1000);

        menpage.pantColour();
        Thread.sleep(1000);

        menpage.addToCart();

        Assert.assertEquals(menpage.verifyAddedItemToTheShoppingCart(), "You added Cronus Yoga Pant to your shopping cart.");

        menpage.clickOnShoppingCartInMessage();

        Assert.assertEquals(shoppingCart.verifyTextShoppingCart(), "Shopping Cart");

        Assert.assertEquals(shoppingCart.verifyTheProductName(), "Cronus Yoga Pant");

        Assert.assertEquals(shoppingCart.verifyTheProductSize(), "32");

        Assert.assertEquals(shoppingCart.verifyTheProductNameColour(), "Black");
    }
}
