package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;

public class NewTest {

    public static void main(String[] args)  {

         //ChromeOptions chromeOptions = new ChromeOptions();

       // chromeOptions.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.edge.driver","Driver/EdgeDriver/msedgedriver.exe");




        WebDriver driver = new EdgeDriver();
        driver.get("http://automationpractice.pl/");

       // driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.findElement(By.id("search_query_top")).sendKeys("mu");

        driver.findElement(By.name("submit_search")).click();

        








//        WebElement enterUserName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
//        enterUserName.sendKeys("uuu");
//
//        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//
//        driver.findElement(By.linkText("company-branding")).isDisplayed();
//
       // driver.findElement(By.xpath("//li[@id='menu-item-3172']/a[contains(text(),'Home')]")).click();

//        driver.findElement(By.id("email")).sendKeys("munna@gamail.com");
//
//        driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("345678");
//
//        driver.findElement(By.linkText("Log In")).click();

//        WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//        element.sendKeys("phone");
//        element.sendKeys(Keys.ENTER);
//
//        Actions actions = new Actions(driver);
//       // actions.moveToElement(element3).build().perform();
//
//
//
//        System.out.println("Print successful");

    }

}
