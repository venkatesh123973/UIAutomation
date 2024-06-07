package com.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectorypageObjects {

    public static DirectorypageObjects instance;

    private DirectorypageObjects(){

    }

    public static DirectorypageObjects getInstance(){
        if(instance==null){
            instance = new DirectorypageObjects();
        }

        return instance;
    }

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Directory']")
    private WebElement Directorylink;

    @FindBy(xpath = "//span[normalize-space()='%s']")
    private WebElement dropdownvalue;

    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
    private WebElement dropdownbutton;

    @FindBy(xpath ="(//div[@class='oxd-select-text-input'])[2]")
    private WebElement locationdropdownbutton;

   @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitbutton;

   public void clickDirectoryLink(){
   Directorylink.click();
    }

    public void jobTitleDropdownactions(){
       dropdownbutton.click();
    }

    public void locationDropdownactions(){
        locationdropdownbutton.click();
    }

    public void submitbuttonaction(){
       submitbutton.click();
    }
}
