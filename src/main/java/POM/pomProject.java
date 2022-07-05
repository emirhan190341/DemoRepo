package POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pomProject {




@Test
    public void verifyValidLogin() throws InterruptedException {


    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com");

    pomPractice login = new pomPractice(driver);


    //bu şekilde kısa yol olarak yapabiliriz
    login.loginToSite("admin","admin123");





//    login.typeUsername("Admin");
//
//    login.typePassword("admin123");
//
//    login.clickButton();
//





    Thread.sleep(5000);

    driver.quit();




    }
}
