import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Practice {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","Driver/EdgeDriver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/jquery-dropdown-search-demo");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        String value ="Australia";
        driver.findElement(By.className("select2-search__field")).click();
        List<WebElement> listDropDown = driver.findElements(By.xpath("//ul[@role='tree']//li"));
        for(WebElement element : listDropDown){
         if (element.getText().equals(value));
         element.click();
         break;
        }

    }






}


