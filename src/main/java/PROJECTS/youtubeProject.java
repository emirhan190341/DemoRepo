package PROJECTS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class youtubeProject {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void verifyTitle() {
        boolean condition = driver.getTitle().contains("YouTube");
        Assert.assertTrue(condition, "Assertion completed");
        System.out.println("Successfull");

    }

    @Test
    public void firstTest(){
        driver.findElement(By.id("search_query")).sendKeys("test automation");


    }
}
