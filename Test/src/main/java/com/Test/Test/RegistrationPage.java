package com.Test.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    public static void registerUser(WebDriver driver) throws InterruptedException {
        
        driver.get("https://juice-shop.herokuapp.com/#/register");


        WebDriverWait wait = new WebDriverWait(driver, 10); 

       
        WebElement emailInput = driver.findElement(By.id("emailControl"));
        WebElement passwordInput = driver.findElement(By.id("passwordControl"));
        WebElement confirmPasswordInput = driver.findElement(By.id("repeatPasswordControl"));
        WebElement securityQuestionDropdown = driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c30-11 ng-star-inserted']"));
        WebElement securityAnswerInput = driver.findElement(By.xpath("//input[@formcontrolname='securityAnswer']"));
        WebElement registerButton = driver.findElement(By.id("registerButton"));

        
        String email = "test" + System.currentTimeMillis() + "@example.com";
        String password = "Test1234";
        String securityAnswer = "MyAnswer123"; 

        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);

        Select securityQuestionSelect = new Select(securityQuestionDropdown);
        securityQuestionSelect.selectByVisibleText("Your eldest sibling's middle name?");

        securityAnswerInput.sendKeys(securityAnswer);

        registerButton.click();

        wait.until(ExpectedConditions.urlToBe("https://juice-shop.herokuapp.com/#/login"));
        
        System.out.println("Current URL after registration: " + driver.getCurrentUrl());
        System.out.println("Current title after registration: " + driver.getTitle());

    }
}

