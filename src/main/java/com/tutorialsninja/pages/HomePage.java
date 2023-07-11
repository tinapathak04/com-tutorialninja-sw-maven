package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By allListOfTopMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");

    By selectLink = By.xpath("//a[text()='Desktops']");
    By mouseHover = By.linkText("Show AllDesktops");
    By desktopText = By.linkText("Desktops");
    By laptopAndNoteBooksLink =By.xpath("//a[text()='Laptops & Notebooks']");
    By mouseHverOnShowAll =By.linkText("Show AllLaptops & Notebooks");
    By laptopText = By.linkText("Laptops & Notebooks");
    By componentsLink = By.xpath("//a[text()='Components']");
    By mouseHoverOnComponents = By.linkText("Show AllComponents");
    By ComponentsText = By.linkText("Components");

    public void selectMenu(String menu){
        List<WebElement> topMenuList = getListOfElements(allListOfTopMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(allListOfTopMenu);
        }
        clickOnElement(By.linkText(menu));
    }


    public void clickOnSelectLink(){
        clickOnElement(selectLink);
    }
    public void clickOnShowAllDesktop(){
        mouseHoverToElement(mouseHover);
    }
    public String verifyText(){
        return getTextFromElement(desktopText);
    }
    public void clickOnLaptopAndNotebooks(){
        clickOnElement(laptopAndNoteBooksLink);
    }
    public void clickOnShowAllLaptops(){
        mouseHoverToElement(mouseHverOnShowAll);
    }
    public String verifyText1(){
        return getTextFromElement(laptopText);
    }
    public void clickOnComponents(){
        clickOnElement(componentsLink);
    }
    public void clickOnAllShowComponents(){
        mouseHoverToElement(mouseHoverOnComponents);
    }
    public String verifyText2(){
        return getTextFromElement(ComponentsText);
    }

}
