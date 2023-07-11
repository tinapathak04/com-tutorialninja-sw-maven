package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homepage = new HomePage();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homepage.selectMenu("Computer");
        homepage.clickOnSelectLink();
        homepage.clickOnShowAllDesktop();
        String expectedText = "Desktops";
        String actualText = homepage.verifyText();
        Assert.assertEquals(actualText,expectedText,"Text not found");
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homepage.clickOnLaptopAndNotebooks();
        homepage.clickOnShowAllLaptops();
        String expectedText = "Laptops & Notebooks";
        String actualText = homepage.verifyText1();
        Assert.assertEquals(actualText,expectedText,"Text not found");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homepage.clickOnComponents();
        homepage.clickOnAllShowComponents();
        String expectedText = "Components";
        String actualText = homepage.verifyText2();
        Assert.assertEquals(actualText,expectedText,"Text not found");


    }


}
