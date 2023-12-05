package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class GearTest extends TestBase {
    HomePage homePage = new HomePage();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();
    GearPage gearPage =new GearPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException
    {
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        Thread.sleep(1000);
        gearPage.clickOnBagProductName();
        overNightDufflePage.verifyTheTextOvernightDuffle();
        Thread.sleep(1000);
        overNightDufflePage.changeQuantity();
        Thread.sleep(1000);
        overNightDufflePage.clickOnAddToCartButton();
        overNightDufflePage.verifyTextYouAdded_ProductNameMessage();
        Thread.sleep(1000);
        overNightDufflePage.clickOnShoppingCartInToMessage();
        shoppingCartPage.verifyTheBagProductName();
        shoppingCartPage.verifyTheProductQuantity();
        shoppingCartPage.verifyTheProductPrice();
        shoppingCartPage.changeShoppingCartQuantity();
        shoppingCartPage.verifyTheProductPrice();
        shoppingCartPage.updateShoppingCartButton();
        shoppingCartPage.verifyTheFinalProductPrice();

    }

}
