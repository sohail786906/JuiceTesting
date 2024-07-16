package com.Test.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public static void loginUser(WebDriver driver) throws InterruptedException {
       
        driver.get("https://juice-shop.herokuapp.com/#/login");

        WebDriverWait wait = new WebDriverWait(driver, 10); 

        WebElement usernameInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        String email = "test" + System.currentTimeMillis() + "@example.com";
        String password = "Test1234";

        usernameInput.sendKeys(email);
        passwordInput.sendKeys(password);

        loginButton.click();

        wait.until(ExpectedConditions.urlToBe("https://juice-shop.herokuapp.com/#/dashboard"));

        System.out.println("Current URL after login: " + driver.getCurrentUrl());
        System.out.println("Current title after login: " + driver.getTitle());

        WebElement welcomeMessage = driver.findElement(By.className("username"));
        String welcomeText = welcomeMessage.getText();
        if (welcomeText.contains("Welcome")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
        }
    }
}
