package PROJECTS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class twitterProject {
    WebDriver driver;


    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://twitter.com/");
        driver.manage().window().maximize();

    }
    @BeforeMethod
    public void verifyHomePage(){
        String actualTitle = driver.getTitle();
        boolean condition = driver.getTitle().contains("Twitter");
        Assert.assertTrue(condition,"Title assertion successfully completed");
    }

    @Test()
    public void firstTest(){
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/div[1]/div/div[3]/div[5]/a/div")).click();

        driver.findElement(By.id("text")).sendKeys("emirhanx2001@hotmail.com");
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div")).click();

    }




}
