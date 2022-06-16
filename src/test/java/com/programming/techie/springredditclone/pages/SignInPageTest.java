package com.programming.techie.springredditclone.pages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

// page_url = about:blank
public class SignInPageTest {
    // No page elements added

    private WebDriver driver;
    private SignInPage signInPageTest;


    @BeforeEach
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Thread.sleep(2500);

        driver.get("http://localhost:4200/login");

        signInPageTest=  new SignInPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();

    }
    @Test
    public void test_case_01_signup() throws InterruptedException {
        SignInPage obj = new SignInPage(driver);
        obj.getLoginInButton().sendKeys("send");
        Thread.sleep(3000);

        obj.getLoginUserName().sendKeys("victor.nkuna@yahoo.com");
//        obj.getUserName().sendKeys("Victor");
        System.out.println("Successfully send username");
        obj.getLoginPassWord().sendKeys("0000");
        Thread.sleep(4000);
        System.out.println("Sign in successfully ");

        obj.getSubmitLoginButton().sendKeys("submitted");

        Thread.sleep(6000);


    }





    public void SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}