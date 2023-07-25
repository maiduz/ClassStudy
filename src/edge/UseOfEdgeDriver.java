package edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UseOfEdgeDriver {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","Driver/EdgeDriver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.facebook.com/");

      //  driver.close();

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();

      //  WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
       // firstName.sendKeys("munna");

       // driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Watch men");
/*

          String actualTitle = driver.getTitle();
        System.out.println("********"+actualTitle+"****************");

               String expectedTitle = "Facebook - log in or sign up";

               if (actualTitle.equalsIgnoreCase(expectedTitle)){
                   System.out.println("Successfully Assertion");
               } else {
                   System.out.println("Assertion is not successfully");
               }

               driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).sendKeys("munna");

*/

       // Thread.sleep(5000);
        //driver.quit();

       // driver.close();



    }
}
