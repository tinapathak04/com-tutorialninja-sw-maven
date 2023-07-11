package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccount extends Utility {

     By accountOption = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
     By clickAccountLink = By.xpath("//span[contains(text(),'My Account')]");
     By verifyRegister = By.xpath("//h1[contains(text(),'Register Account')]");
     By textReturningCustomer = By.xpath("//h2[contains(text(),'Returning Customer')]");
     By password = By.id("input-password");
     By confirmPassword = By.id("input-confirm");
     By selectYes = By.xpath("//fieldset[3]//input");
     By clickCheckBox = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
     By clickContinue = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
     By verifyMassage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
     By continueWithClick = By.xpath("//a[contains(text(),'Continue')]");
     By verifyLogout = By.xpath("//h1[contains(text(),'Account Logout')]");
     By clickLoginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");






    public void selectMyAccountOptions(String option){
        List<WebElement> myAccountList = getListOfElements(accountOption);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(accountOption);
        }

    }
    public void clickOnAccountLink(){
         clickOnElement(clickAccountLink);
    }
    public String verifyOnRegisterLink(){
        return getTextFromElement(verifyRegister);
    }
    public String VerifyReturningCustomer(){
        return getTextFromElement(textReturningCustomer);
    }
    public void enterPassword(){
        sendTextToElement(password,"tp123");
    }
    public void enterConfirmPassword(){
        sendTextToElement(confirmPassword,"tp123");
    }
    public void selectByYes(){
        selectByContainsTextFromDropDown(selectYes,"Yes");
    }
    public void clickOnCheckBox(){
        clickOnElement(clickCheckBox);
    }
    public void clickButtonWithContinue(){
        clickOnElement(clickContinue);
    }
    public String verifyTheMassage(){
        return getTextFromElement(verifyMassage);
    }
    public void clickOnTheContinue(){
        clickOnElement(continueWithClick);
    }
    public String verifyAccountLogout(){
        return getTextFromElement(verifyLogout);
    }
    public void clickOnLoginButton(){
        clickOnElement(clickLoginButton);
    }

    }

