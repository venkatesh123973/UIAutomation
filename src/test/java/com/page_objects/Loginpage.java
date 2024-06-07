package com.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

    public static Loginpage instance;
    private Loginpage(){

    }

    public static Loginpage getInstance(){
        if(instance==null){
            instance= new Loginpage();
        }

        return instance;
    }
    @FindBy(name="username")
    private WebElement Username;

    @FindBy(name = "password")
    private WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement Submitbutton;

    public void enterUsername(String username){
        Username.sendKeys(username);
    }

    public void enterPassword(String password){
        Password.sendKeys(password);
    }

    public void submitbutton(){
        Submitbutton.click();
    }
}
