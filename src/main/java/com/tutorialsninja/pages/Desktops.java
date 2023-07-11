package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class Desktops extends Utility {

    By selectLink = By.xpath("//a[text()='Desktops']");
    By mouseHover = By.linkText("Show AllDesktops");
    By selectPosition = By.xpath("//select[@id='input-sort']");

    By verifyProductOrderInDescending = By.xpath("//select[@id='input-sort']");

    By sortSelectPosition = By.xpath("//select[@id='input-sort']");
    By selectProduct = By.xpath("//a[contains(text(),'HP LP3065')]");
    By verifyProductText = By.linkText("HP LP3065");
    By selectDeliveryDate = By.xpath("//i[@class='fa fa-calendar']");
    By enterQty = By.xpath("//input[@id='input-quantity']");
    By addToCart =By.xpath("//button[@id='button-cart']");
    By verifySuccess = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By clickOnShoppingCart = By.xpath("//span[contains(text(),'Shopping Cart')]");
    By verifyShoppingCart = By.partialLinkText("Shopping ");
    By verifyProductName = By.partialLinkText("HP ");
    By verifyDeliveryDate = By.xpath("//small[text()='Delivery Date:2022-11-30']");
    By verifyModel =By.xpath("//td[contains(text(),'Product 21')]");
    By verifyTotal = By.xpath("div[@class='col-sm-4 col-sm-offset-8']//td[text()='$122.00']");




    public void clickOnSelectLink(){
        clickOnElement(selectLink);
    }
    public void clickOnShowAllDesktop() {
        mouseHoverToElement(mouseHover);
    }
    public void sortByPosition(){
        selectByVisibleTextFromDropDown(selectPosition,"Name: Z to A");
    }
    public String verifyText(){
        return getTextFromElement(verifyProductOrderInDescending);
    }
    public void position(){
        selectByVisibleTextFromDropDown(sortSelectPosition,"Name (A - Z)");
    }
    public void clickOnProduct(){
        clickOnElement(selectProduct);
    }
    public String verifyText2(){
        return getTextFromElement(verifyProductText);
    }
    public void selectDate(){
        String year = "2022";
        String month = "November";
        String date = "30";
        clickOnElement(selectDeliveryDate);
    }
    public void quantity(){
        sendTextToElement(enterQty,"1");
    }
    public void addInCart(){
      clickOnElement(addToCart);
    }
    public String verifyMessageSuccess(){
        return getTextFromElement(verifySuccess);
    }
    public void shoppingCart(){
        clickOnElement(clickOnShoppingCart);
    }
    public String verifyCart(){
      return getTextFromElement(verifyShoppingCart);
    }
    public String ProductNameVarification(){
        return getTextFromElement(verifyProductName);
    }
    public String deliveryDate(){
        return getTextFromElement(verifyDeliveryDate);
    }
    public String modelVerification(){
        return getTextFromElement(verifyModel);
    }
    public String totalVerification(){
        return getTextFromElement(verifyTotal);
    }

}
