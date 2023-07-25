import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/Chrome Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        //Wait for couple of second
     //   Thread.sleep(5000);

      /*  String actualTitle = driver.getTitle();
        System.out.println("*************"+actualTitle+"***********");

        String expectedTitle = "google";

        if(expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Succesfull assertion");
        } else {
            System.out.println("Assertion failed! please check the title");
        }
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hello");
          Thread.sleep(5000);*/
        //closing the window
       // driver.close();
       // close the browser
       // driver.quit();
    }
}

