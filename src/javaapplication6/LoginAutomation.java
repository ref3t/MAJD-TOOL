/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginAutomation {
@Test
public static void main(String [] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
    TimeUnit.SECONDS.sleep(2);
WebElement username=driver.findElement(By.id("email"));
WebElement password=driver.findElement(By.id("pass"));
WebElement login=driver.findElement(By.name("login"));
username.sendKeys("0568075229");
password.sendKeys("refat@rere");
login.click();
//String actualUrl="https://live.browserstack.com/dashboard";
//String expectedUrl= driver.getCurrentUrl();
//Assert.assertEquals(expectedUrl,actualUrl);
}
}
