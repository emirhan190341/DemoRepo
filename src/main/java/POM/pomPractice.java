package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomPractice {
    WebDriver driver;

    By username = By.id("txtUsername");
    By password = By.id("txtPassword");

    By loginButton = By.className("button");

    public pomPractice(WebDriver driver) {
        this.driver = driver;
    }


    //alttaki yazıların tek class içerisinde yazılmış hali
    public void loginToSite(String userid, String pass ){
        driver.findElement(username).sendKeys(userid);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();

    }


    public void typeUsername(String id) {

        driver.findElement(username).sendKeys(id);

    }

    public void typePassword(String pass) {
        driver.findElement(password).sendKeys(pass);

    }

    public void clickButton() {
        driver.findElement(loginButton).click();
    }


}
