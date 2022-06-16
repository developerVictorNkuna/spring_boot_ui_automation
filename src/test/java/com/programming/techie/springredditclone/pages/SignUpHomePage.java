package com.programming.techie.springredditclone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpHomePage {


    public WebElement getSignupButton() {
        return signupButton;
    }

    public void setSignupButton(WebElement signupButton) {
        this.signupButton = signupButton;
    }

    public WebElement getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(WebElement emailAddress) {
        this.emailAddress = emailAddress;
    }

    public WebElement getUserName() {
        return userName;
    }

    public void setUserName(WebElement userName) {
        this.userName = userName;
    }

    public WebElement getPassWord() {
        return passWord;
    }

    public void setPassWord(WebElement passWord) {
        this.passWord = passWord;
    }

    public WebElement getSubmitSignup(String submited) {
        return submitSignup;
    }

    public void setSubmitSignup(WebElement submitSignup) {
        this.submitSignup = submitSignup;
    }

    @FindBy(xpath = " .//a[contains(text(), 'Sign up')]")
    private WebElement signupButton;


    @FindBy(xpath = "/html/body/app-root/app-signup/div/div/div[2]/div/div[2]/form/div[1]/div/input")
    private WebElement emailAddress;


    @FindBy(xpath = "/html/body/app-root/app-signup/div/div/div[2]/div/div[2]/form/div[2]/div/input")
    private  WebElement userName;


    @FindBy(xpath = "/html/body/app-root/app-signup/div/div/div[2]/div/div[2]/form/div[3]/div/input")
    private WebElement passWord;

    @FindBy(xpath = "/html/body/app-root/app-signup/div/div/div[2]/div/div[2]/form/span/button")
    private WebElement submitSignup;


    public SignUpHomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }


}
