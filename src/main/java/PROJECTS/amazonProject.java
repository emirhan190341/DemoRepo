package PROJECTS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class amazonProject {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void verifyHomePageTitleAndUrl() {

        String actualTitle = driver.getTitle();
        boolean condition = driver.getTitle().contains("Amazon");
        Assert.assertTrue(condition, "Title assertion successfully completed");

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com.tr/";
        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("Successful");


    }

    @Test()
    public void firstTest() {
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email")).sendKeys("iberkayuslu41@gmail.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.id("ap_password")).sendKeys("123789465B");
        driver.findElement(By.className("a-button-input")).click();
        System.out.println("Successfully logged in.");

        Assert.assertEquals(true, driver.findElement(By.id("twotabsearchtextbox")).isEnabled());
        System.out.println("Searchbox is enabled");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple AirPods (3. nesil)");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.linkText("Apple AirPods (3. nesil)")).click();

//        Assert.assertEquals(true, driver.findElement(By.className("a-box a-last")).isDisplayed());
//        System.out.println("Box displayed");

        WebElement a = driver.findElement(By.className("a-price-whole"));
        System.out.println(a.getText());

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();


        String  text = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).getText();
        System.out.println(text);




//        driver.findElement(By.className("a-button-text")).click();




    }

//    @Test(priority = 1)
//    public void anotherTest(){
//        driver.findElement(By.id("add-to-cart-button")).click();
//    }


    @AfterTest
    public void tearDown() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();


    }
}