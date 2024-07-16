package com.Test.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JuiceShopAutomation {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();

        try {
            RegistrationPage.registerUser(driver);
            LoginPage.loginUser(driver);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
