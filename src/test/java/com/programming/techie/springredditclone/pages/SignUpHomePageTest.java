package com.programming.techie.springredditclone.pages;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;


public class SignUpHomePageTest {




        private WebDriver driver;
        private SignUpHomePage signUpPage;


        @BeforeEach
        public void setUp() throws InterruptedException {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            Thread.sleep(2500);

            driver.get("http://localhost:4200/sign-up");

            signUpPage =  new SignUpHomePage(driver);
        }

        @AfterEach
        public void tearDown() {
            driver.quit();

        }

        @Test
        public void test_case_01_signup() throws InterruptedException {
            SignUpHomePage obj = new SignUpHomePage(driver);
            obj.getSignupButton().sendKeys("clicked");
            Thread.sleep(3000);

            obj.getEmailAddress().sendKeys("victor.nkuna@hotmail.com");
            obj.getUserName().sendKeys("Victor");
            obj.getPassWord().sendKeys("12345678910");
            Thread.sleep(6000);

            obj.getSubmitSignup("submited");



        }






}


