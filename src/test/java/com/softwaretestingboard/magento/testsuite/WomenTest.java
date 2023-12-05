package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class WomenTest extends TestBase {

    WomenPage womenPage = new WomenPage();
    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException
    {
        womenPage.mouseHoverOnWomenMenu();
        Thread.sleep(1000);
        womenPage.mouseHoverOnTops();
        Thread.sleep(1000);
        womenPage.clickOnJackets();
        womenPage.productListBeforeSorting();
        Thread.sleep(1000);
        womenPage.productListAfterSorting();
        Thread.sleep(1000);
        womenPage.priceListBeforeSorting();
        womenPage.priceListAfterSorting();
    }
}
