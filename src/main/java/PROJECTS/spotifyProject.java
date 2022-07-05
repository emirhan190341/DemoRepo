package PROJECTS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class spotifyProject {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://accounts.spotify.com/tr/login?continue=https%3A%2F%2Fopen.spotify.com%2F");
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void verifyPage(){
        boolean condition = driver.getTitle().contains("Spotify");
        Assert.assertTrue(condition);
        System.out.println("Validated.");

    }

    @Test
    public void firstTest() throws AWTException {
        driver.findElement(By.id("login-username")).sendKeys("emirhan190341@hotmail.com");
        driver.findElement(By.id("login-password")).sendKeys("ceter3l3");
        driver.findElement(By.id("login-button")).click();
        System.out.println("Logged in.");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(true,driver.findElement(By.className("MfVrtIzQJ7iZXfRWg6eM")).isDisplayed());
        System.out.println("Displayed.");


        driver.findElement(By.className("AINMAUImkAYJd4ertQxy")).click();

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_F);



        driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();

//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[2]/main/div/section/div[2]/div[2]/div/button[2]")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"context-menu\"]/ul/li[5]/button")).click();

//      driver.findElement(By.xpath("wC9sIed7pfp47wZbmU6m QgtQw2NJz7giDZxap2BB")).click();











    }



}
