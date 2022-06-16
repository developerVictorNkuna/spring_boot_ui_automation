package com.programming.techie.springredditclone.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {



        @FindBy(xpath = "/html/body/app-root/app-header/header/nav/div[2]/div/a[2]")
        private WebElement LoginInButton;


    public WebElement getLoginInButton() {
        return LoginInButton;
    }

    public void setLoginInButton(WebElement loginInButton) {
        LoginInButton = loginInButton;
    }

    public WebElement getLoginUserName() {
        return LoginUserName;
    }

    public void setLoginUserName(WebElement loginUserName) {
        LoginUserName = loginUserName;
    }

    public WebElement getLoginPassWord() {
        return LoginPassWord;
    }

    public void setLoginPassWord(WebElement loginPassWord) {
        LoginPassWord = loginPassWord;
    }

    public WebElement getSubmitLoginButton() {
        return SubmitLoginButton;
    }

    public void setSubmitLoginButton(WebElement submitLoginButton) {
        SubmitLoginButton = submitLoginButton;
    }

    @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/div/div[2]/form/div[1]/div/input")
        private  WebElement LoginUserName;


        @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/div/div[2]/form/div[2]/div/input")
        private WebElement LoginPassWord;

        @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/div/div[2]/form/span/button")
        private WebElement SubmitLoginButton;


        public SignInPage(WebDriver driver) {
            PageFactory.initElements(driver,this);

        }


    }


